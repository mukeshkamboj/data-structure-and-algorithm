package com.practice.dynamic_programming;

import static org.hamcrest.core.Is.is;

import java.math.BigInteger;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacciNumberSumTest {

  @DisplayName("GIVEN the first N number WHEN findSumOfFibonacciNumber is invoked THEN findSumOfFibonacciNumber method returns the sum of first N even numbers in fibonacci")
  @Test
  public void findFirstNEvenFibonacciNumberSum() {
    //GIVEN
    int firstEvenNumbers = 100;

    //WHEN
    BigInteger sumOfFibonacciNumber = FibonacciNumberSum.findSumOfFibonacciNumber(firstEvenNumbers);

    //THEN
    MatcherAssert.assertThat(sumOfFibonacciNumber,
        is(new BigInteger("290905784918002003245752779317049533129517076702883498623284700")));
  }
}