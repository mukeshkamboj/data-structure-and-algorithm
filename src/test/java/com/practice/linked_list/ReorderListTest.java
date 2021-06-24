package com.practice.linked_list;

import static com.practice.linked_list.LinkedListUtil.areEqual;
import static com.practice.linked_list.LinkedListUtil.createSinglyLinkedList;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ReorderListTest {

  @Test
  public void should_reorder_the_list() {
    //GIVEN
    var head = createSinglyLinkedList(new int[]{1, 2, 3, 4, 5});

    //WHEN
    new ReorderList().reorderList(head);

    //THEN
    var expected = createSinglyLinkedList(new int[]{1, 5, 2, 4, 3});
    assertTrue(areEqual(expected, head));
  }
}