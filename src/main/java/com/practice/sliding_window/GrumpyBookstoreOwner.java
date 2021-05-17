package com.practice.sliding_window;

//https://leetcode.com/problems/grumpy-bookstore-owner/
public class GrumpyBookstoreOwner {

  public int maxSatisfiedCustomers(int[] customers, int[] grumpy, int minutes) {
    int satisfiedCustomers = 0;
    for (int i = 0; i < customers.length; i++) {
      if (grumpy[i] == 0) {
        satisfiedCustomers += customers[i];
      }
    }

    int left = 0;
    int right = 0;
    int max = satisfiedCustomers;
    int cur = 0;
    for (; right < customers.length; right++) {
      if (grumpy[right] == 1) {
        cur += customers[right];
      }
      while (right - left + 1 > minutes) {
        if (grumpy[left] == 1) {
          cur -= customers[left];
        }
        left++;
      }
      max = Math.max(max, satisfiedCustomers + cur);
    }

    return max;
  }
}
