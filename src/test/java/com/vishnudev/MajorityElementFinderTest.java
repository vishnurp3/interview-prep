package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementFinderTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    @DisplayName("Test findMajorityElement method")
    void testFindMajorityElement(int[] input, int expected) {
        assertEquals(expected, MajorityElementFinder.findMajorityElement(input));
    }

    static Stream<Object[]> arrayProvider() {
        return Stream.of(
                new Object[]{new int[]{3, 2, 3}, 3},
                new Object[]{new int[]{2, 2, 1, 1, 1, 2, 2}, 2},
                new Object[]{new int[]{1, 1, 1, 1, 2, 3, 4, 1}, 1},
                new Object[]{new int[]{4, 4, 2, 4, 3, 4, 4}, 4},
                new Object[]{new int[]{5, 5, 5, 5, 5, 5, 5}, 5},
                new Object[]{new int[]{7, 8, 7, 7, 7, 8, 7}, 7}
        );
    }
}
