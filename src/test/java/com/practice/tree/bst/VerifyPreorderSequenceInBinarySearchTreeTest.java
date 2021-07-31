package com.practice.tree.bst;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class VerifyPreorderSequenceInBinarySearchTreeTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testValidatePreorder(int[] preOrder, boolean expected) {
    //WHEN
    var isValid = new VerifyPreorderSequenceInBinarySearchTree().validatePreorder(preOrder);
    //THEN
    Assertions.assertEquals(expected, isValid);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{10, 4, 3, 5, 15, 13, 16}, true),
        Arguments.arguments(new int[]{10, 4, 3, 5, 15, 16, 13}, false),
        Arguments.arguments(new int[]{10, 9, 8, 7, 6, 5, 4}, true),
        Arguments.arguments(new int[]{10, 11, 12, 13, 14, 15, 16}, true),
        Arguments.arguments(new int[]{10}, true)
    );
  }
}