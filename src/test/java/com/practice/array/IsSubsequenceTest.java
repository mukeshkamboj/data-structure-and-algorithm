package com.practice.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class IsSubsequenceTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testExist(String subString, String string, boolean expected) {
    //WHEN
    var actual = new IsSubsequence().exist(subString, string);
    //THEN
    Assertions.assertEquals(expected, actual);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("abc", "abbhhcc", true),
        Arguments.arguments("abcx", "abbhhcc", false),
        Arguments.arguments("abc", "abc", true),
        Arguments.arguments("", "", true),
        Arguments.arguments("", "aa", true),
        Arguments.arguments("a", "a", true)
    );
  }
}