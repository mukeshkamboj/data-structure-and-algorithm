package com.practice.recursion;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AllStringPermutationsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testGetAllPermutations(String string, Set<String> expected) {
    //WHEN
    var permutations = new AllStringPermutations().getAllPermutations(string);
    //THEN
    Assertions.assertIterableEquals(expected, permutations);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("abc", new TreeSet<>(Set.of("abc", "acb", "bac", "bca", "cab", "cba")))
    );
  }
}