package com.practice.dynamic_programming;

public class ReverseInteger {

  public static void main(String[] args) {
    System.out.println(new ReverseInteger().reverse(-123));
    System.out.println(new ReverseInteger().reverse(123));
    System.out.println(new ReverseInteger().reverse(120));
    System.out.println(new ReverseInteger().reverse(1534236469));
    System.out.println(new ReverseInteger().reverse(-2147483412));
  }

  public int reverse(int x) {
    int result = 0;
    while (x != 0) {
      int tail = x % 10;
      int newResult = (result * 10) + tail;
      if (((newResult - tail) / 10) != result) {
        return 0;
      }
      result = newResult;
      x = x / 10;
    }
    return result;
  }
}
