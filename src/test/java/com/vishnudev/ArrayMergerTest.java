package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayMergerTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    @DisplayName("Test mergeSortedArrays method")
    void testMergeSortedArrays(int[] nums1, int[] nums2, int[] expected) {
        assertArrayEquals(expected, ArrayMerger.mergeSortedArrays(nums1, nums2));
    }

    static Stream<Object[]> arrayProvider() {
        return Stream.of(
                new Object[]{new int[]{1, 3, 5}, new int[]{2, 4, 6}, new int[]{1, 2, 3, 4, 5, 6}},
                new Object[]{new int[]{}, new int[]{1, 2, 3}, new int[]{1, 2, 3}},
                new Object[]{new int[]{1, 2, 3}, new int[]{}, new int[]{1, 2, 3}},
                new Object[]{new int[]{1, 1, 1}, new int[]{1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1}},
                new Object[]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6}},
                new Object[]{new int[]{3, 4, 5}, new int[]{1, 2, 6}, new int[]{1, 2, 3, 4, 5, 6}}
        );
    }
}
