package com.practice.linked_list;

import static com.practice.linked_list.LinkedListUtil.createSinglyLinkedList;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveNthNodeFromEndOfListTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testRemoveNthFromEnd(ListNode head, int nth, ListNode expected) {
    //WHEN
    var list = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, nth);

    //THEN
    Assertions.assertTrue(LinkedListUtil.areEqual(expected, list));
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(createSinglyLinkedList(1, 2, 3, 4, 5), 2,
            createSinglyLinkedList(1, 2, 3, 5)),
        Arguments.arguments(createSinglyLinkedList(1), 1,
            createSinglyLinkedList()),
        Arguments.arguments(createSinglyLinkedList(1, 2), 1,
            createSinglyLinkedList(1))
    );
  }

}