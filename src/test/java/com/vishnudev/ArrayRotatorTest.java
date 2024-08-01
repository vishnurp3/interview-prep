package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayRotatorTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    @DisplayName("Test rotate method")
    void testRotate(int[] input, int k, int[] expected) {
        ArrayRotator.rotate(input, k);
        assertArrayEquals(expected, input);
    }

    static Stream<Object[]> arrayProvider() {
        return Stream.of(
                new Object[]{new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}},
                new Object[]{new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100}},
                new Object[]{new int[]{1, 2, 3, 4, 5}, 10, new int[]{1, 2, 3, 4, 5}},
                new Object[]{new int[]{1, 2, 3}, 4, new int[]{3, 1, 2}},
                new Object[]{new int[]{1}, 0, new int[]{1}},
                new Object[]{new int[]{}, 1, new int[]{}}
        );
    }
}
