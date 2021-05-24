package com.practice.two_pointers;

//https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
public class FindLongestSequenceOfZeros {

  public int findLongestSequence(int number) {
    int max = 0;
    String bs = findBinaryString(number);
    int l = 0;
    int r = 0;
    while (r < bs.length()) {
      char rc = bs.charAt(r);
      if (rc == '1' && r - l != 0) {
        max = Math.max(max, r - l - 1);
        l = r;
      }
      r++;
    }
    return max;
  }

  static String findBinaryString(int num) {
    String str = "";
    while (num > 0) {
      str = num % 2 + str;
      num = num / 2;
    }
    return str;
  }
}
