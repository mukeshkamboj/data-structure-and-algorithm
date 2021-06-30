package com.practice.tree;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MinimumDepthOfBinaryTreeTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void findMinDepth(TreeNode root, int expected) {
    //WHEN
    var val = new MinimumDepthOfBinaryTree().minDepth(root);
    //THEN
    Assertions.assertEquals(expected, val);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(TreeUtil.build(new int[]{3, 9, 20, 15, 7}), 2),
        Arguments.arguments(TreeUtil.build(new int[]{2, 3, 4, 5, 6}), 5)
    );
  }

}