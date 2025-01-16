package com.StreamaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice4 {
    public static void main(String[] args){
//        Given a list of words, find the most frequent word.
//        If multiple words have the same frequency, return the first one.

        List<String> words = Arrays.asList("apple", "banana", "orange", "banana", "apple", "apple", "orange");
           String word=   words.stream()
                               .collect(Collectors.groupingBy(w-> w, Collectors.counting()))

                   .entrySet()
                   .stream()
                   .max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println(word);

    }

}
