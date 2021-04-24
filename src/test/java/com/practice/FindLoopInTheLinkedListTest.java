package com.practice;

import static org.hamcrest.core.Is.is;

import com.practice.FindLoopInTheLinkedList.Node;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindLoopInTheLinkedListTest {

  @DisplayName("GIVEN a linked list with loop WHEN findLoop is called THEN true is returned")
  @Test
  public void testFindLoopWithLoopInLinkedList() {
    //GIVEN
    Node head = new Node(1);
    Node previous = head;
    for (int i = 0; i < 10; i++) {
      previous.setNext(new Node(i));
      previous = previous.getNext();
    }
    //creating loop
    previous.setNext(head.getNext().getNext());

    //WHEN
    boolean containsLoop = new FindLoopInTheLinkedList().containsLoop(head);
    //THEN
    MatcherAssert.assertThat(containsLoop, is(true));
  }

  @DisplayName("GIVEN a linked list with no loop WHEN findLoop is called THEN false is returned")
  @Test
  public void testFindLoopWithNoLoopInLinkedList() {
    //GIVEN
    Node head = new Node(10);
    Node previous = head;
    for (int i = 9; i > 1; i--) {
      previous.setNext(new Node(i));
      previous = previous.getNext();
    }
    //WHEN
    boolean containsLoop = new FindLoopInTheLinkedList().containsLoop(head);
    //THEN
    MatcherAssert.assertThat(containsLoop, is(false));
  }

  @DisplayName("GIVEN a linked list with loop WHEN findLoop is called THEN true is returned")
  @Test
  public void testFindLoopWithNull() {
    //GIVEN
    Node head = null;
    //WHEN
    boolean containsLoop = new FindLoopInTheLinkedList().containsLoop(head);
    //THEN
    MatcherAssert.assertThat(containsLoop, is(false));
  }
}