package com.practice.dynamic_programming;

import static java.util.Comparator.comparing;
import static java.util.Objects.nonNull;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.Map;

class RemoveAllOccurrencesOfValueToGetMaxSumOfArray {
  static int find(int[] arr) {
    if (nonNull(arr) && arr.length > 1) {
      Map<Integer, Integer> map = Arrays.stream(arr)
          .boxed()
          .collect(toMap(identity(), o -> 1, Integer::sum));
      return map.entrySet().stream().min(comparing(o -> o.getKey() * o.getValue())).get().getKey();
    }
    return -1;
  }
}
