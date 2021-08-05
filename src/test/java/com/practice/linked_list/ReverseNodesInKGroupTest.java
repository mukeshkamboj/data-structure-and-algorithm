package com.practice.linked_list;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseNodesInKGroupTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testReverseKGroup(ListNode head, int k, ListNode expected) {
    //WHEN
    var reversedList = new ReverseNodesInKGroup().reverseKGroup(head, k);

    //THEN
    Assertions.assertTrue(LinkedListUtil.areEqual(expected, reversedList));
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(LinkedListUtil.createSinglyLinkedList(1, 2, 3, 4, 5), 2,
            LinkedListUtil.createSinglyLinkedList(2, 1, 4, 3, 5)),
        Arguments.arguments(LinkedListUtil.createSinglyLinkedList(1, 2, 3, 4, 5), 3,
            LinkedListUtil.createSinglyLinkedList(3, 2, 1, 4, 5)),
        Arguments.arguments(LinkedListUtil.createSinglyLinkedList(1, 2, 3, 4, 5), 5,
            LinkedListUtil.createSinglyLinkedList(5, 4, 3, 2, 1)),
        Arguments.arguments(LinkedListUtil.createSinglyLinkedList(1, 2, 3, 4, 5), 1,
            LinkedListUtil.createSinglyLinkedList(1, 2, 3, 4, 5))
    );
  }

}