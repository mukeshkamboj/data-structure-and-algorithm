package com.practice.string;

//https://leetcode.com/problems/replace-all-digits-with-characters/
public class ReplaceAllDigitsWithCharacters {

  public String replaceDigitWithChar(String val) {
    char[] charArr = val.toCharArray();
    for (int i = 1; i < charArr.length; i = i + 2) {
      charArr[i] = (char) (charArr[i - 1] + Character.getNumericValue(charArr[i]));
    }
    return new String(charArr);
  }
}
