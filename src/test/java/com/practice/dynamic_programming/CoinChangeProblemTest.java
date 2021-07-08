package com.practice.dynamic_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CoinChangeProblemTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindWays(List<Long> list, int sum, int expectedWaysCount) {
//WHEN
    var ways = new CoinChangeProblem().getWays(sum, list);

    //THEN
    Assertions.assertEquals(expectedWaysCount, ways);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(Arrays.asList(8L, 3L, 1L, 2L), 3, 3),
        Arguments.arguments(Arrays.asList(3L, 1L, 2L), 4, 4)
    );
  }

}