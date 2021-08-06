package com.practice.math;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PermutationSequenceTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindPermutationSequence(int n, int k, String expected) {
    //WHEN
    var permutation = new PermutationSequence().findPermutationSequence(n, k);
    //THEN
    Assertions.assertEquals(expected, permutation);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(4, 14, "3142"),
        Arguments.arguments(4, 14, "3142"),
        Arguments.arguments(9, 100, "123495786")
    );
  }
}