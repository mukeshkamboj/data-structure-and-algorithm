package com.practice.linked_list;

import java.util.Stack;

public class ReorderList {

  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }

    Stack<ListNode> stack = new Stack<>();
    ListNode ptr = head;
    int c = -1;
    while (ptr != null) {
      stack.push(ptr);
      ptr = ptr.next;
      c++;
    }

    ptr = head;
    c = c / 2;
    while (c-- > 0) {
      ListNode top = stack.pop();
      top.next = ptr.next;
      ptr.next = top;
      ptr = top.next;
    }
    stack.pop().next = null;
  }
}
