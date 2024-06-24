package com.vishnudev;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static Character findFirstNonRepeatedCharacter(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : input.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
