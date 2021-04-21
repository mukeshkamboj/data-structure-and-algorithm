package com.practice.array;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DecompressRunLengthEncodedListTest {

  @DisplayName("GIVEN the array WHEN decompress is invoked THEN decompressed array is returned")
  @Test
  public void testDecompressTheGivenArray() {
    // GIVEN
    int[] arr = {1, 2, 3, 4};
    //WHEN
    int[] decompressedResult = new DecompressRunLengthEncodedList().decompress(arr);
    //THEN
    MatcherAssert.assertThat(decompressedResult, Is.is(new int[]{2, 4, 4, 4}));
  }
}