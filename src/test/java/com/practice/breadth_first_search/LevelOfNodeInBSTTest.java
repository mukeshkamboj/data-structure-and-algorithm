package com.practice.breadth_first_search;

import com.practice.tree.TreeNode;
import com.practice.tree.TreeUtil;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LevelOfNodeInBSTTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindLevelOfGivenNode(TreeNode root, int nodeValue, int expected) {
    //WHEN
    var level = new LevelOfNodeInBST().findLevelOfGivenNode(root, nodeValue);
    //THEN
    Assertions.assertEquals(expected, level);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(TreeUtil.build(new int[]{65, 23, 54, 78, 21, 98}), 21, 2),
        Arguments.arguments(TreeUtil.build(new int[]{65, 23, 54, 78, 21, 98}), 98, 2),
        Arguments.arguments(TreeUtil.build(new int[]{65, 23, 54, 78, 45, 98}), 45, 3)
    );
  }
}