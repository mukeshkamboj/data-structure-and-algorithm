package com.practice.tree;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SumOfLeftLeavesTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void findSumOfLeftLeaves(TreeNode root, int expected) {
    //WHEN
    var val = new SumOfLeftLeaves().sumOfLeftLeaves(root);
    //THEN
    Assertions.assertEquals(expected, val);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(TreeUtil.build(new int[]{3, 2, 20, 15, 7}), 9),
        Arguments.arguments(TreeUtil.build(new int[]{1}), 0)
    );
  }

}