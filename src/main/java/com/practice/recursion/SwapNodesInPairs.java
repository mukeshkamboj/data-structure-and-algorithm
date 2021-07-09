package com.practice.recursion;

import com.practice.linked_list.ListNode;
// https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapNodesInPairs {

  public ListNode swapPairs(ListNode first) {
    if (first != null && first.getNext() != null) {
      ListNode second = first.getNext();
      ListNode third = first.getNext().getNext();
      second.setNext(first);
      first.setNext(swapPairs(third));
      return second;
    }
    return first;
  }
}
