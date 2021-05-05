package com.practice.backtracking;

import static com.practice.test.TestUtil.convert;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CombinationSumTest {

  @ParameterizedTest
  @MethodSource("arrayProvider")
  public void testFindCombination(int[] arr, int target, List<List<Integer>> expected) {
    List<List<Integer>> combinations = new CombinationSum().combinationSum(arr, target);
    Assertions.assertEquals(expected, combinations);
  }

  static Stream<Arguments> arrayProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{}, 2, convert(new int[][]{})),
        Arguments.arguments(new int[]{1}, 2, convert(new int[][]{{1, 1}})),
        Arguments.arguments(new int[]{2}, 1, convert(new int[][]{})),
        Arguments.arguments(new int[]{1}, 1, convert(new int[][]{{1}})),
        Arguments.arguments(new int[]{2, 3, 6, 7}, 7, convert(new int[][]{{2, 2, 3}, {7}})),
        Arguments
            .arguments(new int[]{2, 3, 5}, 8, convert(new int[][]{{2, 2, 2, 2}, {2, 3, 3}, {3, 5}}))
    );
  }
}