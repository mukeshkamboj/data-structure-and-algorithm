package com.practice.recursion.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RegularExpressionMatchingTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testIsMatch(String s, String p, boolean expected) {
    //WHEN
    var isMatching = new RegularExpressionMatching().isMatch(s, p);
    //THEN
    Assertions.assertEquals(expected, isMatching);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("aab", "c*a*b", true),
        Arguments.arguments("aab", "cc*a*b", false),
        Arguments.arguments("mississippi", "mis*is*p*.", false),
        Arguments.arguments("mississippi", "mis*is*ip*.", true)
    );
  }

}