package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementFinderTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    @DisplayName("Test findKthLargest method")
    void testFindKthLargest(int[] input, int k, int expected) {
        assertEquals(expected, KthLargestElementFinder.findKthLargest(input, k));
    }

    static Stream<Object[]> arrayProvider() {
        return Stream.of(
                new Object[]{new int[]{3, 2, 1, 5, 6, 4}, 2, 5},
                new Object[]{new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4, 4},
                new Object[]{new int[]{1}, 1, 1},
                new Object[]{new int[]{7, 10, 4, 3, 20, 15}, 3, 10},
                new Object[]{new int[]{7, 10, 4, 3, 20, 15}, 4, 7},
                new Object[]{new int[]{-1, -1, -2, -2, 0, 0}, 1, 0}
        );
    }
}
