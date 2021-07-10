package com.practice.recursion.linkedList;

import com.practice.linked_list.ListNode;

//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {

  public ListNode reverseList(ListNode listNode) {
    return reverse(listNode, null);
  }

  private ListNode reverse(ListNode head, ListNode tail) {
    if (head == null) {
      return tail;
    }
    ListNode nextHead = head.getNext();
    head.setNext(tail);
    tail = head;
    return reverse(nextHead, tail);
  }
}
