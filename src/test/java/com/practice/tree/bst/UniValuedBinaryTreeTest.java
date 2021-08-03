package com.practice.tree.bst;

import com.practice.tree.TreeNode;
import com.practice.tree.TreeUtil;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class UniValuedBinaryTreeTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCheckUniValueBST(TreeNode root, boolean expected) {
    //WHEN
    var isUniValueBST = new UniValuedBinaryTree().checkUniValueBST(root);
    //THEN
    Assertions.assertEquals(expected, isUniValueBST);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(TreeUtil.build(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), true),
        Arguments.arguments(TreeUtil.build(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0), false)
    );
  }

}