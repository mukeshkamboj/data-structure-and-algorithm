package com.practice.greedy;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class JumpGameTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testCanJump(int[] arr, boolean expected) {
    //WHEN
    var canJump = new JumpGame().canJump(arr);
    //THEN
    Assertions.assertEquals(expected, canJump);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new int[]{2, 3, 1, 1, 4}, true),
        Arguments.arguments(new int[]{3, 2, 1, 0, 4}, false)
    );
  }
}