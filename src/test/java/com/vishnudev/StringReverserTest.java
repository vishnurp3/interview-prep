package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringReverserTest {

    @ParameterizedTest
    @MethodSource("stringProvider")
    @DisplayName("Test reverse method")
    void testReverse(String input, String expected) {
        assertEquals(expected, StringReverser.reverse(input));
    }

    static Stream<Object[]> stringProvider() {
        return Stream.of(
                new Object[]{"hello", "olleh"},
                new Object[]{"", ""},
                new Object[]{"a", "a"},
                new Object[]{"ab", "ba"},
                new Object[]{"abc", "cba"},
                new Object[]{"racecar", "racecar"},
                new Object[]{"A man, a plan, a canal, Panama", "amanaP ,lanac a ,nalp a ,nam A"}
        );
    }
}
