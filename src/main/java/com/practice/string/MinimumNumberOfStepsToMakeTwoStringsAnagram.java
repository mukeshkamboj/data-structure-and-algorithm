package com.practice.string;

//https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

  public int stepsCount(String str1, String str2) {
    int count = 0;
    int[] fs1 = new int[26];
    int[] fs2 = new int[26];
    for (char ch : str1.toCharArray()) {
      fs1[ch - 'a']++;
    }
    for (char ch : str2.toCharArray()) {
      fs2[ch - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (fs1[i] > fs2[i]) {
        count += fs1[i] - fs2[i];
      }
    }
    return count;
  }
}
