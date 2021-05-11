package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseVowelsOfStringTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testReverseVowels(String str, String expected) {
    //WHEN
    var reverseVowels = new ReverseVowelsOfString().reverseVowels(str);
    //THEN
    Assertions.assertEquals(expected, reverseVowels);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(" ", " "),
        Arguments.arguments("!@#$#@", "!@#$#@"),
        Arguments.arguments("aA", "Aa"),
        Arguments.arguments("aaaaaa", "aaaaaa"),
        Arguments.arguments("hello", "holle"),
        Arguments.arguments("leetcode", "leotcede")
    );
  }
}