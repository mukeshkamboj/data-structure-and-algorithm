package com.practice.tree;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaximumDepthOfBinaryTreeTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void findTestDataProvider(TreeNode root, int expected) {
    //WHEN
    var val = new MaximumDepthOfBinaryTree().maxDepth(root);
    //THEN
    Assertions.assertEquals(expected, val);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(TreeUtil.build(new int[]{5, 4, 3, 2, 1}), 5),
        Arguments.arguments(TreeUtil.build(new int[]{5, 4, 6, 2, 8}), 3)
    );
  }
}