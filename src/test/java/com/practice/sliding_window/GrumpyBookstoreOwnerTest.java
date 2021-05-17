package com.practice.sliding_window;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class GrumpyBookstoreOwnerTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void testMaxSatisfiedCustomers(int[] customers, int[] grumpy, int minutes, int expected) {
    //WHEN
    var maxSatisfiedCustomer = new GrumpyBookstoreOwner()
        .maxSatisfiedCustomers(customers, grumpy, minutes);
    //THEN
    Assertions.assertEquals(maxSatisfiedCustomer, expected);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments
            .arguments(new int[]{1, 0, 1, 2, 1, 1, 7, 5}, new int[]{0, 1, 0, 1, 0, 1, 0, 1}, 3, 16),
        Arguments.arguments(new int[]{4, 10, 10}, new int[]{1, 1, 0}, 2, 24),
        Arguments.arguments(new int[]{1}, new int[]{1}, 1, 1),
        Arguments.arguments(new int[]{0}, new int[]{1}, 1, 0)
    );
  }
}