package com.practice.backtracking;

import static com.practice.test.TestUtil.convert;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CombinationsWithTwoIntegersTest {

  @ParameterizedTest
  @MethodSource("testInputProviders")
  public void testCombineMethod(int n, int k, List<List<Integer>> expected) {
    //WHEN
    List<List<Integer>> combine = new CombinationsWithTwoIntegers().combine(n, k);

    //THEN
    Assertions.assertEquals(expected, combine);
  }

  static Stream<Arguments> testInputProviders() {
    return Stream.of(
        Arguments
            .arguments(1, 1,
                convert(new int[][]{{1}})),
        Arguments
            .arguments(10, 10,
                convert(new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}})),
        Arguments
            .arguments(4, 2,
                convert(new int[][]{{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}}))
    );
  }
}