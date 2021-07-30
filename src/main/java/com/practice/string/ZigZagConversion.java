package com.practice.string;

//https://leetcode.com/problems/zigzag-conversion/
public class ZigZagConversion {

  public String convert(String string, int numRows) {
    int nr = Math.min(string.length(), numRows);
    StringBuilder[] sbArr = new StringBuilder[nr];
    int i = 0;
    while (i < string.length()) {
      for (int j = 0; j < nr && i < string.length(); j++) {
        if (sbArr[j] == null) {
          sbArr[j] = new StringBuilder();
        }
        sbArr[j].append(string.charAt(i++));
      }

      for (int j = nr - 2; j >= 1 && i < string.length(); j--) {
        sbArr[j].append(string.charAt(i++));
      }
    }
    for (int j = 1; j < nr; j++) {
      sbArr[0].append(sbArr[j]);
    }
    return sbArr[0].toString();
  }
}
