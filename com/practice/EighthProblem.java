package com.practice;

import java.util.HashMap;
import java.util.Map;

public class EighthProblem {
    public static void main(String[] args) {
        String str1 = "aabcd";
        firstNonRepeatedChar(str1);
    }

    private static void firstNonRepeatedChar(String str1) {
        Map<Character,Integer> chaeFreq=new HashMap<>();
        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            chaeFreq.put(ch, chaeFreq.getOrDefault(ch, 0) + 1);
        }
//        for(int i=0; i < str1.length(); i++){
//            char c=str1.charAt(i);
//            if(map.get(c)==1){
//                return c;
//            }
//        }
//        return '0';
//    }
        for(char ch : chaeFreq.keySet()) {
            if(chaeFreq.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }

    }
}
//"Given a string,
//        return the first non-repeating character.
//
//Examples:
//String str1 = "12345";
////Return 1
//
//String str2 = ""abbacd""
//Return c"