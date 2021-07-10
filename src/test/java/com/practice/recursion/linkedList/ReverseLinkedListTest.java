package com.practice.recursion.linkedList;

import static com.practice.linked_list.LinkedListUtil.createSinglyLinkedList;

import com.practice.linked_list.LinkedListUtil;
import com.practice.linked_list.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseLinkedListTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testReverseList(ListNode listNode, ListNode expected) {
    //WHEN
    var reversed = new ReverseLinkedList().reverseList(listNode);

    //THEN
    Assertions.assertTrue(LinkedListUtil.areEqual(expected, reversed));
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments
            .arguments(createSinglyLinkedList(1, 2, 3, 4, 5),
                createSinglyLinkedList(5, 4, 3, 2, 1)),
        Arguments
            .arguments(createSinglyLinkedList(1), createSinglyLinkedList(1)),
        Arguments
            .arguments(createSinglyLinkedList(), createSinglyLinkedList())
    );
  }
}