package com.practice.disjoin_set;

import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EmpiresLeftAfterInvasion {

  public static int numberOfEmpireLeft(int numberOfEmpires, int[][] invasions) {

    int[] empires = new int[numberOfEmpires + 1];
    IntStream.range(0, numberOfEmpires + 1).forEach(i -> empires[i] = i);

    for (int[] invasion : invasions) {
      invasion(empires, invasion[0], invasion[1]);
    }

    return Arrays.stream(empires).boxed().filter(i -> i != 0).collect(toSet()).size();
  }

  private static void invasion(int[] empires, int invader, int empire) {
    for (int i = 1; i < empires.length; i++) {
      if (empires[i] == empire) {
        empires[i] = invader;
      }
    }
  }

}
