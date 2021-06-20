package com.practice.hash_map;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class HappyNumberTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testIsHappy(int n, boolean expected) {
    //WHEN
    var isHappy = new HappyNumber().isHappy(n);
    //THEN
    Assertions.assertEquals(expected, isHappy);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(2, false),
        Arguments.arguments(7, true),
        Arguments.arguments(19, true)
    );
  }

}