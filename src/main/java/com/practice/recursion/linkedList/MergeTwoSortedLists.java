package com.practice.recursion.linkedList;

import com.practice.linked_list.ListNode;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {

  public ListNode mergeSortedList(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }

    if (l2 == null) {
      return l1;
    }

    if (l1.getVal() <= l2.getVal()) {
      l1.setNext(mergeSortedList(l1.getNext(), l2));
      return l1;
    } else {
      l2.setNext(mergeSortedList(l1, l2.getNext()));
      return l2;
    }
  }
}
