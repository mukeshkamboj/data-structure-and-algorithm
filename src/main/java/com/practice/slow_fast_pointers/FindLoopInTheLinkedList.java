package com.practice.slow_fast_pointers;

//https://leetcode.com/problems/linked-list-cycle/submissions/
public class FindLoopInTheLinkedList {

  public boolean containsLoop(Node head) {
    if (head == null) {
      return false;
    }
    Node slow = head;
    Node fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  public static class Node {

    private int value;
    private Node next;

    Node(int value) {
      this.value = value;
    }

    public void setNext(Node next) {
      this.next = next;
    }

    public Node getNext() {
      return this.next;
    }
  }
}
