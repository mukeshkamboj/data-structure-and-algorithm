package com.practice.string;

import com.practice.test.TestUtil;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class GroupAnagramsTest {

  @ParameterizedTest
  @MethodSource("testDataProvider")
  public void test(String[] stringList, List<List<String>> expected) {
    //WHEN
    var anagramGroups = new GroupAnagrams().groupAnagrams(stringList);

    //THEN
    Assertions.assertIterableEquals(expected, anagramGroups);
  }

  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.arguments(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
            TestUtil.convert(new String[][]{{"eat", "tea", "ate"}, {"bat"}, {"tan", "nat"}}))
    );
  }
}