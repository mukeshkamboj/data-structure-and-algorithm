package com.practice.linked_list;

public class ReverseNodesInKGroup {

  public ListNode reverseKGroup(ListNode head, int k) {
    if (k == 1) {
      return head;
    }

    ListNode ptr = head;
    ListNode res = null;
    ListNode lastNode = null;

    while (ptr != null) {

      ListNode start = ptr;
      ListNode end = ptr;
      int i = 1;

      while (end != null && i < k) {
        end = end.getNext();
        i++;
      }

      if (end != null && i == k) {
        ptr = end.next;
        ListNode newHead = end.next;
        if (lastNode != null) {
          lastNode.next = end;
        }
        lastNode = start;
        while (i-- >= 1) {
          ListNode temp = start.getNext();
          start.next = newHead;
          newHead = start;
          start = temp;
        }
        if (res == null) {
          res = newHead;
        }
      } else {
        ptr = null;
      }

    }
    return res;
  }
}
