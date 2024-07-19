package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberFinderTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    @DisplayName("Test findMissingNumber method")
    void testFindMissingNumber(int[] input, int expected) {
        assertEquals(expected, MissingNumberFinder.findMissingNumber(input));
    }

    static Stream<Object[]> arrayProvider() {
        return Stream.of(
                new Object[]{new int[]{3, 0, 1}, 2},
                new Object[]{new int[]{0, 1}, 2},
                new Object[]{new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8},
                new Object[]{new int[]{0}, 1},
                new Object[]{new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100}, 0}
        );
    }
}
