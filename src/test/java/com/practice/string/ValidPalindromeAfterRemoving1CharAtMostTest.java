package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ValidPalindromeAfterRemoving1CharAtMostTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testValidPalindrome(String str, boolean expected) {
    //WHEN
    var validPalindrome = new ValidPalindromeAfterRemoving1CharAtMost().validPalindrome(str);
    Assertions.assertEquals(expected, validPalindrome);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(
            "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga",
            true),
        Arguments.arguments("aba", true),
        Arguments.arguments("abca", true),
        Arguments.arguments("abcea", false),
        Arguments.arguments("abc", false)
    );
  }
}