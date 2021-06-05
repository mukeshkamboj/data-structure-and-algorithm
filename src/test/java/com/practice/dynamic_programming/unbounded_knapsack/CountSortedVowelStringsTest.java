package com.practice.dynamic_programming.unbounded_knapsack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CountSortedVowelStringsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCountVowelStrings(int n, int expectedCount) {
    //WHEN
    var actual = new CountSortedVowelStrings().countVowelStrings(n);
    //THEN
    Assertions.assertEquals(expectedCount, actual);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(1, 5),
        Arguments.arguments(2, 15),
        Arguments.arguments(33, 66045)
    );
  }
}