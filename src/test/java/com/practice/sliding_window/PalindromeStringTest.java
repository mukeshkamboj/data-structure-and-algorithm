package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PalindromeStringTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testIsPalindrome(String str, boolean expected) {
    //WHEN
    boolean isPalindrome = new PalindromeString().isPalindrome(str);
    //THEN
    Assertions.assertEquals(expected, isPalindrome);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("abcba", true),
        Arguments.arguments("afba", false),
        Arguments.arguments("", true),
        Arguments.arguments("A man, a plan, a canal: Panama", true),
        Arguments.arguments("race a car", false),
        Arguments.arguments("0P", false),
        Arguments.arguments(" ", true)
    );
  }
}