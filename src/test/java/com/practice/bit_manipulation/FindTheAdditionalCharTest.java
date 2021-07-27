package com.practice.bit_manipulation;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindTheAdditionalCharTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testFindAdditionalCharacter(String s, String t, char expected) {
    //WHEN
    var diff = new FindTheAdditionalChar().findAdditionalCharacter(s, t);
    //THEN
    Assertions.assertEquals(expected, diff);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("abc", "ncab", 'n'),
        Arguments.arguments("abcd", "abecd", 'e'),
        Arguments.arguments("a", "aa", 'a'),
        Arguments.arguments("", "y", 'y')
    );
  }
}