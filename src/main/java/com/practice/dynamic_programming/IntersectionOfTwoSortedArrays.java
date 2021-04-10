package com.practice.dynamic_programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoSortedArrays {

  public static void main(String[] args) {
    System.out.println(
        "Intersection of two sorted arrays {0, 1, 2, 3, 3, 4} & {0, 0, 0, 3, 3, 4, 5, 6, 9, 9} is : "
            + Arrays.toString(
            intersection(new int[]{0, 1, 2, 3, 3, 4}, new int[]{0, 0, 0, 3, 3, 4, 5, 6, 9, 9})));
    System.out.println(
        "Intersection of two sorted arrays {1, 2, 3, 4, 5} & {6 ,7 ,8 ,9} is : " + Arrays.toString(
            intersection(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9})));
    System.out.println("Intersection of two sorted arrays {} & {} is : " + Arrays.toString(
        intersection(new int[]{}, new int[]{})));
  }

  public static int[] intersection(int[] arr1, int[] arr2) {
    Set<Integer> set = new HashSet<>();
    int itr1 = 0;
    int itr2 = 0;
    while (itr1 < arr1.length && itr2 < arr2.length) {
      if (arr1[itr1] < arr2[itr2]) {
        itr1++;
      } else if (arr2[itr2] < arr1[itr1]) {
        itr2++;
      } else {
        set.add(arr2[itr2]);
        itr2++;
        itr1++;
      }
    }
    return set.stream().mapToInt(Number::intValue).toArray();
  }
}
