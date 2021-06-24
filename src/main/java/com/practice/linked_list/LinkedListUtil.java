package com.practice.linked_list;

public class LinkedListUtil {

  public static ListNode createSinglyLinkedList(int[] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }

    ListNode head = new ListNode(arr[0]);
    ListNode ptr = head;
    for (int i = 1; i < arr.length; i++) {
      ptr.next = new ListNode(arr[i]);
      ptr = ptr.next;
    }

    return head;
  }

  public static boolean areEqual(ListNode h1, ListNode h2) {
    ListNode ptr1 = h1;
    ListNode ptr2 = h2;

    while (ptr1 != null && ptr2 != null) {
      if (ptr1.getVal() != ptr2.getVal()) {
        return false;
      }
      ptr1 = ptr1.next;
      ptr2 = ptr2.next;
    }

    return ptr1 == null && ptr2 == null;
  }

}
