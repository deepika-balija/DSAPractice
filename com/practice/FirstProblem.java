package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstProblem {
    public static void main(String[] args) {
        String input ="aabbaacc";
        System.out.println(findingStringCompress(input));
    }

    private static String findingStringCompress(String input) {
        StringBuilder result = new StringBuilder();
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }
            for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                result.append(entry.getKey()).append(entry.getValue());
            }

        return result.toString();
    }
}
