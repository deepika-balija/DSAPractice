package com.interview_preparation;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacters {
    public static void main(String[] args) {
        String input = "swierss";
        char result = findFirstNonRepeatingChar(input);
        if (result != 0) {
            System.out.println("First Non Repaeting Char is: " + result);
        } else {
            System.out.println("No first repaeted Character.");
        }
    }

    private static char findFirstNonRepeatingChar(String input) {

        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
//            mp.put(c, mp.getOrDefault(c, 0) + 1);
            if(mp.containsKey(c)){
                mp.put(c, mp.get(c)+1);
            }else {
                mp.put(c,1);
            }
        }

        for(char c : input.toCharArray())
            if(mp.get(c) == 1){
                return c;
        }
        return '\0';

    }

}
