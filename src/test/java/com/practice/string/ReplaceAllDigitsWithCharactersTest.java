package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReplaceAllDigitsWithCharactersTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testReplaceDigitWithChar(String val, String expected) {
    //WHEN
    var replacedString = new ReplaceAllDigitsWithCharacters().replaceDigitWithChar(val);
    //THEN
    Assertions.assertEquals(expected, replacedString);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments("a1c1e1", "abcdef"),
        Arguments.arguments("a1b2c3d4e", "abbdcfdhe")
    );
  }
}