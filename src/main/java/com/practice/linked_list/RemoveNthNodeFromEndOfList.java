package com.practice.linked_list;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEndOfList {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    int size = 0;
    ListNode ptr = head;
    while (ptr != null) {
      size++;
      ptr = ptr.next;
    }

    if (size == 1) {
      return null;
    }

    if (size == n) {
      return head.next;
    }

    int tbr = size - n;
    ptr = head;
    while (tbr > 1) {
      ptr = ptr.next;
      tbr--;
    }

    ptr.next = ptr.next.next;
    return head;
  }
}
