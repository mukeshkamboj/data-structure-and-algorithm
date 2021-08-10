package com.practice.recursion.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class IntegerToEnglishWordsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testConvert(int num, String expectedConversion) {
    //WHEN
    var conversion = new IntegerToEnglishWords().convert(num);
    //THEN
    Assertions.assertEquals(expectedConversion, conversion);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(2000000012, "Two Billion Twelve"),
        Arguments.arguments(123, "One Hundred Twenty Three"),
        Arguments.arguments(12345, "Twelve Thousand Three Hundred Forty Five"),
        Arguments.arguments(1234567,
            "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"),
        Arguments.arguments(1234567891,
            "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One")
    );
  }
}