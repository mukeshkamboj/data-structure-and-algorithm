package com.practice.dynamic_programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

class FindSameDegreeSubArrayLength {

  static int findSameDegreeMinSubArrayLength(int[] arr) {

    if (Objects.nonNull(arr) && arr.length > 0) {
      Map<Integer, Integer> map = Arrays.stream(arr)
          .boxed()
          .collect(Collectors.toMap(Function.identity(), o -> 1, Integer::sum));

      Map.Entry<Integer, Integer> max = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();

      List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().filter(e -> e.getValue().equals(max.getValue())).collect(Collectors.toList());

      return list.stream().map(e -> {
            Integer first = null;
            Integer last = null;
            for (int i = 0; i < arr.length; i++) {
              if (Objects.isNull(first) && arr[i] == e.getKey()) {
                first = i;
              } else if (Objects.nonNull(first) && arr[i] == e.getKey()) {
                last = i;
              }
            }
            return Objects.nonNull(last) ? last - first + 1 : 1;
          }
      ).min(Comparator.comparing(Integer::valueOf)).get();
    }

    return 0;
  }
}
