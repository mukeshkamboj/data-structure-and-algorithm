package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestPalindromicSubStringLengthTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testLongestPalindrome(String input, String expected) {
    //WHEN
    var longestPalindrome = new LongestPalindromicSubStringLength().longestPalindrome(input);
    //THEN
    Assertions.assertEquals(expected, longestPalindrome);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("abaqweewqqwertrewqlkjhgfdsasdfghjkl", "lkjhgfdsasdfghjkl"),
        Arguments.arguments("qwertyuioppoiuytrewq", "qwertyuioppoiuytrewq"),
        Arguments.arguments("qwertyuiopasdfghjkl", ""),
        Arguments.arguments("aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa"),
        Arguments.arguments("", ""),
        Arguments.arguments("q", "q")
    );
  }
}