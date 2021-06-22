package com.practice.tree;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RangeSumOfBSTTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void findRangeSum(TreeNode root, int low, int high, int expected) {
    //WHEN
    var val = new RangeSumOfBST().rangeSumBST(root, low, high);
    //THEN
    Assertions.assertEquals(expected, val);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(TreeUtil.build(new int[]{10, 5, 15, 3, 7, 18}), 7, 15, 32),
        Arguments.arguments(TreeUtil.build(new int[]{10, 5, 15, 3, 7, 13, 18, 1, 6}), 6, 10, 23)
    );
  }
}