package com.StreamaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of strings, group them by their first letter and
// then count how many words start with each letter.

public class Practice1 {
    public static void main(String args[]){

        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry", "date");
       Map<Character, Long> wordsCounting= words.stream()
                .collect(Collectors.groupingBy(w->w.charAt(0), Collectors.counting()));
        System.out.println(wordsCounting);

    }
}
//{a=3, b=2, c=1, d=1}