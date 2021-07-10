package com.practice.recursion.linkedList;

import static com.practice.linked_list.LinkedListUtil.createSinglyLinkedList;

import com.practice.linked_list.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PalindromeLinkedListTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testIsPalindrome(ListNode list, boolean expected) {
    //WHEN
    var isPalindrome = new PalindromeLinkedList().isPalindrome(list);
    //THEN
    Assertions.assertEquals(expected, isPalindrome);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(createSinglyLinkedList(1, 2, 3, 2, 1), true),
        Arguments.arguments(createSinglyLinkedList(1, 2, 3, 3, 1), false),
        Arguments.arguments(createSinglyLinkedList(1), true),
        Arguments.arguments(createSinglyLinkedList(), false)
    );
  }
}