package com.interview_preparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharactersUsingStreams {
    public static void main(String[] args) {
        String input = "swierss";
        System.out.println(findFirstNonRepeatingChar(input));

    }
        private static char findFirstNonRepeatingChar(String input) {

        Map<Character, Integer>  charFreq= input.chars()
                .mapToObj(c->(char)c)
                .collect(LinkedHashMap::new, (map, c)-> map.put(c, map.getOrDefault(c,0)+1), Map :: putAll);

    return    charFreq.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry:: getKey)
                .findFirst()
                .orElse( '\0');

    }
}
