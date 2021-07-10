package com.practice.recursion.linkedList;

import com.practice.linked_list.ListNode;
import java.util.Stack;

public class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {
    if (head == null) {
      return false;
    }

    ListNode slow = head;
    ListNode fast = head;
    Stack<ListNode> stack = new Stack<>();
    while (fast != null && fast.getNext() != null) {
      stack.push(slow);
      slow = slow.getNext();
      fast = fast.getNext().getNext();
    }

    if (fast != null) {
      slow = slow.getNext();
    }

    while (stack.size() != 0) {
      ListNode n = stack.pop();
      if (n.getVal() != slow.getVal()) {
        return false;
      }
      slow = slow.getNext();
    }

    return true;
  }
}
