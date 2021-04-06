package com.practice.sliding_window;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LengthOfLongestSubstringWithNoRepeatingCharacter {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
    System.out.println(lengthOfLongestSubstring("bbbbb"));
    System.out.println(lengthOfLongestSubstring("pwwkew"));
    System.out.println(lengthOfLongestSubstring(""));
  }

  public static int lengthOfLongestSubstring(String s) {
    int startPointer = 0;
    int endPointer = 0;
    int maxLength = 0;

    Map<Character, Integer> map = new HashMap<>();

    while (endPointer < s.length()) {
      char right = s.charAt(endPointer);
      map.put(right, map.getOrDefault(right, 0) + 1);

      while (map.get(right) > 1) {
        char left = s.charAt(startPointer++);
        map.put(left, map.get(left) - 1);
        if (map.get(left) == 0) {
          map.remove(left);
        }
      }

      maxLength = Math.max(maxLength, endPointer - startPointer + 1);
      endPointer++;
    }
    return maxLength;
  }
}
