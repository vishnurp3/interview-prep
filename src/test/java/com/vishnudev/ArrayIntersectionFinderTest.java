package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayIntersectionFinderTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    @DisplayName("Test findIntersection method")
    void testFindIntersection(int[] nums1, int[] nums2, int[] expected) {
        int[] result = ArrayIntersectionFinder.findIntersection(nums1, nums2);
        Arrays.sort(result);
        Arrays.sort(expected);
        assertArrayEquals(expected, result);
    }

    static Stream<Object[]> arrayProvider() {
        return Stream.of(
                new Object[]{new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2}},
                new Object[]{new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{4, 9}},
                new Object[]{new int[]{}, new int[]{}, new int[]{}},
                new Object[]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{}},
                new Object[]{new int[]{1, 2, 3, 4}, new int[]{4, 5, 6, 1}, new int[]{1, 4}},
                new Object[]{new int[]{2, 2, 2, 2}, new int[]{2, 2, 2, 2}, new int[]{2}}
        );
    }
}
