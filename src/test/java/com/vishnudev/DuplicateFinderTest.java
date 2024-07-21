package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateFinderTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    @DisplayName("Test findDuplicates method")
    void testFindDuplicates(int[] input, List<Integer> expected) {
        assertEquals(expected, DuplicateFinder.findDuplicates(input));
    }

    static Stream<Object[]> arrayProvider() {
        return Stream.of(
                new Object[]{new int[]{4, 3, 2, 7, 8, 2, 3, 1}, List.of(2, 3)},
                new Object[]{new int[]{1, 1, 2}, List.of(1)},
                new Object[]{new int[]{1}, List.of()},
                new Object[]{new int[]{1, 2, 3, 4, 5}, List.of()},
                new Object[]{new int[]{5, 5, 5, 5, 5}, List.of(5)},
                new Object[]{new int[]{2, 3, 3, 2, 2, 3}, List.of(2, 3)}
        );
    }
}