package com.practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCompress {
    public static void main(String[] args){
        String input = "aabbaccdcbd"; //a3b3c3d2
        System.out.println(stringCompress(input));

    }

    private static String stringCompress(String input) {

        StringBuilder sb= new StringBuilder();
        Map<Character,Integer> mp= new HashMap<>();
        for(int i=0; i<input.length(); i++){
            char ch= input.charAt(i);
           mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : mp.entrySet() ){
            sb.append(entry.getKey()).append(entry.getValue());

        }
        System.out.println(mp);
        return sb.toString();

    }
}
//"Convert a string as given in the format below:
//
//Example:
//aabbb into a2b3
//aaaa into a4
//a into a1"