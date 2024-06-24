package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatedCharacterTest {

    @ParameterizedTest
    @MethodSource("stringProvider")
    @DisplayName("Test findFirstNonRepeatedCharacter method")
    void testFindFirstNonRepeatedCharacter(String input, Character expected) {
        assertEquals(expected, FirstNonRepeatedCharacter.findFirstNonRepeatedCharacter(input));
    }

    static Stream<Object[]> stringProvider() {
        return Stream.of(
                new Object[]{"hello", 'h'},
                new Object[]{"aabbcc", null},
                new Object[]{"aabbccd", 'd'},
                new Object[]{"abcabcde", 'd'},
                new Object[]{"", null},
                new Object[]{"a", 'a'},
                new Object[]{"abacabad", 'c'}
        );
    }
}
