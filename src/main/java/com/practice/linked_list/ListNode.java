package com.practice.linked_list;

import lombok.Data;

@Data
public class ListNode {

  public int val;
  public ListNode next;
  public ListNode pre;

  public ListNode(int val) {
    this.val = val;
  }
}
