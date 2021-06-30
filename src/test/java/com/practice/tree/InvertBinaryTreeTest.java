package com.practice.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class InvertBinaryTreeTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testInvertTree(TreeNode root, List<Integer> expectedTree) {
    //WHEN
    new InvertBinaryTree().invertTree(root);
    //THEN
    List<Integer> actual = new LinkedList<>();
    TreeUtil.inOrderArray(root, actual);
    Assertions.assertIterableEquals(expectedTree, actual);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(TreeUtil.build(new int[]{4, 2, 7, 1, 3, 6, 9}),
            Arrays.asList(4, 7, 9, 6, 2, 3, 1)),
        Arguments.arguments(TreeUtil.build(new int[]{2, 1, 3}),
            Arrays.asList(2, 3, 1))
    );
  }
}
