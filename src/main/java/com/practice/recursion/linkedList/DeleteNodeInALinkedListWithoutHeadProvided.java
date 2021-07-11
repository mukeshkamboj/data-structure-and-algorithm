package com.practice.recursion.linkedList;

import com.practice.linked_list.ListNode;

//https://leetcode.com/problems/delete-node-in-a-linked-list/
public class DeleteNodeInALinkedListWithoutHeadProvided {

  public void removeNode(ListNode nodeToBeDeleted) {
    nodeToBeDeleted.setVal(nodeToBeDeleted.getNext().getVal());
    nodeToBeDeleted.setNext(nodeToBeDeleted.getNext().getNext());
  }
}
