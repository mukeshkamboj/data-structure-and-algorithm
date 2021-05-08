package com.practice.string;

//https://leetcode.com/problems/sort-characters-by-frequency/
public class SortCharactersByFrequency {

  public String frequencySort(String str) {
    int[] freq = new int[256];
    for (char ch : str.toCharArray()) {
      freq[ch]++;
    }

    char[] output = new char[str.length()];
    int outPutIndex = 0;
    while (outPutIndex < str.length()) {
      int max = 0;
      int charIndex = -1;
      for (int i = 0; i < freq.length; i++) {
        if (max < freq[i]) {
          max = freq[i];
          charIndex = i;
        }
      }

      if (max == 0) {
        return new String(output);
      }

      int temp = max;
      while (temp-- > 0) {
        output[outPutIndex++] = (char) charIndex;
      }
      freq[charIndex] = 0;
    }

    return new String(output);
  }
}
