package com.practice.string;

import java.util.Set;

//https://leetcode.com/problems/reverse-vowels-of-a-string/
public class ReverseVowelsOfString {

  static Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

  public String reverseVowels(String s) {
    int start = 0;
    int end = s.length() - 1;
    char[] output = s.toCharArray();
    while (end > start) {
      char chEnd = output[end];
      char chStart = output[start];
      if (vowels.contains(chEnd) && vowels.contains(chStart)) {
        output[end] = chStart;
        output[start] = chEnd;
        start++;
        end--;
      }

      if (!vowels.contains(chEnd)) {
        end--;
      }

      if (!vowels.contains(chStart)) {
        start++;
      }

    }
    return new String(output);
  }

}
