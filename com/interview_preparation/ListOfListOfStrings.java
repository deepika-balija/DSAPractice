package com.interview_preparation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ListOfListOfStrings {
    public static void main(String[] args) {
        List<List<String>> listOfList = List.of(
                List.of("apple", "banana", "apple"),
                List.of("orange", "apple", "banana"),
                List.of("banana", "kiwi")
        );
        Map<String, Long> result = countStringFrequency(listOfList);
        Map<String, Long> result1 = countStringFrequencywithStreams(listOfList);
        System.out.println(result+" "+ result1);
    }
        public static Map<String, Long> countStringFrequency(List<List<String>> listOfLists){
        Map<String, Long> mp = new TreeMap<>();
        for(List<String> innerList : listOfLists){
            for(String item : innerList){
                mp.put(item, mp.getOrDefault(item,0L)+1);
            }
        }
        return mp;
    }
    public static Map<String, Long> countStringFrequencywithStreams(List<List<String>> listOfLists){
        return listOfLists.stream()
                .flatMap(List :: stream)
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
    }
}