package com.vishnudev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeCheckerTest {

    @ParameterizedTest
    @MethodSource("stringProvider")
    @DisplayName("Test isPalindrome method")
    void testIsPalindrome(String input, boolean expected) {
        assertEquals(expected, PalindromeChecker.isPalindrome(input));
    }

    static Stream<Object[]> stringProvider() {
        return Stream.of(
                new Object[]{"A man, a plan, a canal, Panama", true},
                new Object[]{"racecar", true},
                new Object[]{"hello", false},
                new Object[]{"", true},
                new Object[]{"Was it a car or a cat I saw", true},
                new Object[]{"No 'x' in Nixon", true},
                new Object[]{"12321", true},
                new Object[]{"12345", false}
        );
    }
}
