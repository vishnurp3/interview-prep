package com.vishnudev;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
