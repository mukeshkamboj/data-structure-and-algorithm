package com.practice.tree;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindClosestValueInBSTTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindClosestValue(TreeNode root, int number, int expected) {
    //WHEN
    var closestValue = new FindClosestValueInBST().findClosestNumber(root, number);
    //THEN
    Assertions.assertEquals(expected, closestValue);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(TreeUtil.build(new int[]{10, 5, 15, 2, 1, 3, 15, 13, 22, 14}), 12, 13)
    );
  }

}