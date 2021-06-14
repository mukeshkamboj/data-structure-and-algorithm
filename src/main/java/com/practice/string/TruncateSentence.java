package com.practice.string;

//https://leetcode.com/problems/truncate-sentence/
public class TruncateSentence {

  public String truncateSentence(String str, int k) {
    int i = 0;
    int count = 0;
    while (i < str.length() && count < k) {
      char ch = str.charAt(i++);
      if (ch == ' ') {
        count++;
      }
    }

    return count == k ? str.substring(0, i - 1) : str;
  }
}
