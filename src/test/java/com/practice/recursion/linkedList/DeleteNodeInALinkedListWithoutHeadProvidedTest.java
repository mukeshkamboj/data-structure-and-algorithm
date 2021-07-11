package com.practice.recursion.linkedList;

import static com.practice.linked_list.LinkedListUtil.areEqual;
import static com.practice.linked_list.LinkedListUtil.createSinglyLinkedList;

import com.practice.linked_list.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DeleteNodeInALinkedListWithoutHeadProvidedTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testRemoveNode(ListNode list, ListNode nodeToBeDeleted, ListNode expected) {
    //WHEN
    new DeleteNodeInALinkedListWithoutHeadProvided().removeNode(nodeToBeDeleted);
    //THEN
    Assertions.assertTrue(areEqual(expected, list));
  }

  static Stream<Arguments> testDataProvider() {
    ListNode l1 = createSinglyLinkedList(1, 2, 3, 4, 5, 6);
    ListNode l2 = createSinglyLinkedList(1, 2, 3, 4, 5, 6);
    ListNode l3 = createSinglyLinkedList(1, 2, 3, 4, 5, 6);
    return Stream.of(
        Arguments.arguments(l1, l1.getNext(), createSinglyLinkedList(1, 3, 4, 5, 6)),
        Arguments.arguments(l2, l2.getNext().getNext(), createSinglyLinkedList(1, 2, 4, 5, 6)),
        Arguments
            .arguments(l3, l3.getNext().getNext().getNext(), createSinglyLinkedList(1, 2, 3, 5, 6))
    );
  }

}