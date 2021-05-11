package com.practice.string;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/reverse-vowels-of-a-string/
public class ReverseVowelsOfString {

  static Set<Character> vowels = new HashSet<>();

  static {
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    vowels.add('A');
    vowels.add('E');
    vowels.add('I');
    vowels.add('O');
    vowels.add('U');
  }

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
