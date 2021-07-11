package com.practice.recursion.linkedList;

import static com.practice.linked_list.LinkedListUtil.areEqual;
import static com.practice.linked_list.LinkedListUtil.createSinglyLinkedList;

import com.practice.linked_list.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveLinkedListElementsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testRemoveGivenElement(ListNode listNode, int num, ListNode expected) {
    //WHEN
    var listAfterRemovingGivenElement = new RemoveLinkedListElements()
        .removeGivenElement(listNode, num);
    //THEN
    Assertions.assertTrue(areEqual(expected, listAfterRemovingGivenElement));
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(createSinglyLinkedList(1, 2, 3, 4, 5, 2, 6, 7, 2, 8, 9), 2,
            createSinglyLinkedList(1, 3, 4, 5, 6, 7, 8, 9)),
        Arguments.arguments(createSinglyLinkedList(1), 1,
            createSinglyLinkedList()),
        Arguments.arguments(createSinglyLinkedList(3, 3, 3, 3, 3, 3), 3,
            createSinglyLinkedList()),
        Arguments.arguments(createSinglyLinkedList(3, 3, 3, 3, 3, 3), 4,
            createSinglyLinkedList(3, 3, 3, 3, 3, 3))
    );
  }

}