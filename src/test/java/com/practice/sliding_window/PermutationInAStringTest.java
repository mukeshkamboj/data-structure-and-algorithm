package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PermutationInAStringTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFind(String stringContainingThePermutation, String pattern, boolean expected) {
    //WHEN
    boolean containingPermutation = new PermutationInAString()
        .checkInclusion(pattern, stringContainingThePermutation);
    //THEN
    Assertions.assertEquals(expected, containingPermutation);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("abcdxabcde", "abcdeabcdx", true),
        Arguments.arguments("oidbcaf", "abc", true),
        Arguments.arguments("odicf", "dc", false),
        Arguments.arguments("bcdxabcdy", "bcdyabcdx", true),
        Arguments.arguments("aaacb", "aabca", true),
        Arguments.arguments("ppqp", "pq", true)
    );
  }
}