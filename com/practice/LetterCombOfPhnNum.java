package com.practice;

import java.util.*;

public class LetterCombOfPhnNum {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(findingLetterCombOfPhnNum(digits));
    }

    private static List<String> findingLetterCombOfPhnNum(String digits) {
        Map<String, String> mplist = new HashMap<>();
        mplist.put("2", "abc");
        mplist.put("3", "def");
        mplist.put("4", "ghi");
        mplist.put("5", "jkl");
        mplist.put("6", "mno");
        mplist.put("7", "pqrs");
        mplist.put("8", "tuv");
        mplist.put("9", "wxyz");
        mplist.put("0", "0");
        mplist.put("1", "1");

        List<String> result = new ArrayList<>();
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(" ");

        for (char str : digits.toCharArray()) {
            String letters = mplist.get(str);
            int size = queue.size();
            if (size != 0) {
                for (int i = 0; i < size; i++) {
                    String current = queue.poll();
                    System.out.println(current);
                    System.out.println(letters);
                    for (char c : letters.toCharArray()) {
                        queue.add(current+c);
                    }


                }
            }


        }
        result.addAll(queue);
        return result;
    }
}
