package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BackspaceStringCompareTest {

  @ParameterizedTest
  @MethodSource("testDataProviders")
  public void testBackspaceCompare(String str1, String str2, boolean expected) {
    //WHEN
    var areEqual = new BackspaceStringCompare().backspaceCompare(str1, str2);
    //THEN
    Assertions.assertEquals(expected, areEqual);
  }

  static Stream<Arguments> testDataProviders() {
    return Stream.of(
        Arguments.arguments("ab#c", "ad#c", true),
        Arguments.arguments("a#", "e#", true),
        Arguments.arguments("a#e", "e#", false)
    );
  }
}