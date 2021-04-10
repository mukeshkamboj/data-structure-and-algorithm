package com.practice.dynamic_programming;

import java.math.BigInteger;

public class FibonacciNumberSum {
  
  public static BigInteger findSumOfFibonacciNumber(int howManyEvenNumbers) {
    if (howManyEvenNumbers <= 1) {
      return BigInteger.ZERO;
    }

    int evenNumberCount = 2;
    BigInteger previous = BigInteger.valueOf(0);
    BigInteger current = BigInteger.valueOf(2);
    BigInteger sum = previous.add(current);
    while (evenNumberCount <= howManyEvenNumbers) {
      BigInteger next = current.multiply(BigInteger.valueOf(4)).add(previous);
      //Check even or not
      if (next.getLowestSetBit() != 0) {
        previous = current;
        current = next;
        sum = sum.add(current);
        evenNumberCount++;
      }
    }
    return sum;
  }
}
