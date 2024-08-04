package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesTest {

    @ParameterizedTest
    @MethodSource("stringProvider")
    @DisplayName("Test isValid method")
    void testIsValid(String input, boolean expected) {
        assertEquals(expected, ValidParentheses.isValid(input));
    }

    static Stream<Object[]> stringProvider() {
        return Stream.of(
                new Object[]{"()", true},
                new Object[]{"()[]{}", true},
                new Object[]{"(]", false},
                new Object[]{"([)]", false},
                new Object[]{"{[]}", true},
                new Object[]{"", true},
                new Object[]{"{", false},
                new Object[]{"{[()()]}", true}
        );
    }
}
