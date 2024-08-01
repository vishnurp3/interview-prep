package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarraySumTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    @DisplayName("Test maxSubArray method")
    void testMaxSubArray(int[] input, int expected) {
        assertEquals(expected, MaximumSubarraySum.maxSubArray(input));
    }

    static Stream<Object[]> arrayProvider() {
        return Stream.of(
                new Object[]{new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6},
                new Object[]{new int[]{2, -1, 3}, 4},
                new Object[]{new int[]{1}, 1},
                new Object[]{new int[]{5, 4, -1, 7, 8}, 23},
                new Object[]{new int[]{-1, -2, -3, -4}, -1},
                new Object[]{new int[]{0, -3, 1, 1}, 2},
                new Object[]{new int[]{1, 2, 3, 4, 5}, 15}
        );
    }
}
