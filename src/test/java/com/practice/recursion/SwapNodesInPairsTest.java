package com.practice.recursion;

import static com.practice.linked_list.LinkedListUtil.createSinglyLinkedList;

import com.practice.linked_list.LinkedListUtil;
import com.practice.linked_list.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SwapNodesInPairsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testSwapPairs(ListNode head, ListNode expected) {
    //WHEN
    var swapped = new SwapNodesInPairs().swapPairs(head);

    //THEN
    Assertions.assertTrue(LinkedListUtil.areEqual(expected, swapped));
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(createSinglyLinkedList(new int[]{1, 2, 3, 4}),
            createSinglyLinkedList(new int[]{2, 1, 4, 3})),
        Arguments.arguments(createSinglyLinkedList(new int[]{1}),
            createSinglyLinkedList(new int[]{1})),
        Arguments.arguments(createSinglyLinkedList(new int[]{1, 2}),
            createSinglyLinkedList(new int[]{2, 1})),
        Arguments.arguments(createSinglyLinkedList(new int[]{}),
            createSinglyLinkedList(new int[]{}))
    );
  }

}