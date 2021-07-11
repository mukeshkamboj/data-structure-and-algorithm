package com.practice.recursion.linkedList;

import static com.practice.linked_list.LinkedListUtil.areEqual;
import static com.practice.linked_list.LinkedListUtil.createSinglyLinkedList;

import com.practice.linked_list.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MergeTwoSortedListsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testMergeSortedLists(ListNode l1, ListNode l2, ListNode expected) {
    //WHEN
    var mergedList = new MergeTwoSortedLists().mergeSortedList(l1, l2);
    //THEN
    Assertions.assertTrue(areEqual(expected, mergedList));
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(createSinglyLinkedList(1, 2, 3), createSinglyLinkedList(4, 5, 6),
            createSinglyLinkedList(1, 2, 3, 4, 5, 6)),
        Arguments.arguments(createSinglyLinkedList(1, 1, 1, 1), createSinglyLinkedList(1, 1, 1, 1),
            createSinglyLinkedList(1, 1, 1, 1, 1, 1, 1, 1)),
        Arguments.arguments(createSinglyLinkedList(1, 2, 3, 4), createSinglyLinkedList(1, 2, 3, 4),
            createSinglyLinkedList(1, 1, 2, 2, 3, 3, 4, 4))
    );
  }

}