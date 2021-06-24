package com.practice.linked_list;

import lombok.Data;

@Data
public class ListNode {

  int val;
  ListNode next;
  ListNode pre;

  public ListNode(int val) {
    this.val = val;
  }
}
