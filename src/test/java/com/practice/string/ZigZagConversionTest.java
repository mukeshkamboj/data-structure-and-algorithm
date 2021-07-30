package com.practice.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ZigZagConversionTest {

  @ParameterizedTest
  @MethodSource("testDataSource")
  public void testConvert(String string, int numRows, String expected) {
    //WHEN
    var converted = new ZigZagConversion().convert(string, numRows);
    //THEN
    Assertions.assertEquals(expected, converted);
  }

  static Stream<Arguments> testDataSource() {
    return Stream.of(
        Arguments.arguments("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
        Arguments.arguments("PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
        Arguments.arguments("A", 4, "A"),
        Arguments.arguments("A", 1, "A")
    );
  }

}