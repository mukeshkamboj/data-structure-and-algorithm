package com.practice.string;

import java.util.HashSet;
import java.util.Set;

public class PangramString {

  public static boolean isPangram(String sentence) {
    Set<Character> set = new HashSet<>();
    int count = 0;
    for (int i = 0; i < sentence.length(); i++) {
      if (!set.contains(sentence.charAt(i))) {
        count++;
        set.add(sentence.charAt(i));
      }

      if (count == 26) {
        break;
      }
    }
    return count == 26;
  }
}
