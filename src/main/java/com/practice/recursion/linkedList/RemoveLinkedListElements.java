package com.practice.recursion.linkedList;

import com.practice.linked_list.ListNode;

public class RemoveLinkedListElements {

  public ListNode removeGivenElement(ListNode listNode, int num) {
    if (listNode == null) {
      return null;
    }

    ListNode next = removeGivenElement(listNode.getNext(), num);
    if (listNode.getVal() == num) {
      return next;
    }
    listNode.setNext(next);
    return listNode;
  }
}
