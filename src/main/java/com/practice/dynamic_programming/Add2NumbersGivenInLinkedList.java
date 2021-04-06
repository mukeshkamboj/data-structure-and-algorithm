package com.practice.dynamic_programming;

//https://leetcode.com/problems/add-two-numbers/
public class Add2NumbersGivenInLinkedList {

  private static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode();
    ListNode l2 = new ListNode();
    int[] arr1 = {9, 9, 9, 9, 9, 9, 9};
    int[] arr2 = {9, 9, 9, 9};
    boolean firstTime = true;
    ListNode itr = l1;
    for (int j : arr1) {
      if (firstTime) {
        firstTime = false;
      } else {
        itr.next = new ListNode();
        itr = itr.next;
      }
      itr.val = j;
    }
    itr = l2;
    firstTime = true;
    for (int j : arr2) {
      if (firstTime) {
        firstTime = false;
      } else {
        itr.next = new ListNode();
        itr = itr.next;
      }
      itr.val = j;
    }
    ListNode tempNode = addTwoNumbers(l1, l2);
    while (tempNode != null) {
      System.out.println(tempNode.val);
      tempNode = tempNode.next;
    }
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode();
    ListNode itrResult = result;
    int sum;
    int carry = 0;
    ListNode itrL1 = l1;
    ListNode itrL2 = l2;
    boolean first = true;
    while (itrL1 != null & itrL2 != null) {

      if (first) {
        first = false;
      } else {
        itrResult.next = new ListNode();
        itrResult = itrResult.next;
      }

      sum = itrL1.val + itrL2.val + carry;
      carry = sum / 10;
      if (sum >= 10) {
        itrResult.val = sum % 10;
      } else {
        itrResult.val = sum;
      }
      itrL1 = itrL1.next;
      itrL2 = itrL2.next;
    }

    ListNode itr = itrL1 != null ? itrL1 : itrL2;

    while (itr != null) {
      itrResult.next = new ListNode();
      itrResult = itrResult.next;
      sum = itr.val + carry;
      carry = sum / 10;
      if (sum >= 10) {
        itrResult.val = sum % 10;
      } else {
        itrResult.val = sum;
      }
      itr = itr.next;
    }

    if (carry > 0) {
      itrResult.next = new ListNode(carry);
    }

    return result;
  }
}
