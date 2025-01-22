package com.interview_preparation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfListOfStrings {
    public static void main(String[] args) {
        List<List<String>> listOfList = List.of(
                List.of("apple", "banana", "apple"),
                List.of("orange", "apple", "banana"),
                List.of("banana", "kiwi")
        );
        Map<String, Long> result = countStringFrequency(listOfList);
        System.out.println(result);
    }
        public static Map<String, Long> countStringFrequency(List<List<String>> listOfLists){
        return listOfLists.stream()
                .flatMap(List::stream) // Flatten the list of lists into a single stream of strings
                .collect(Collectors.groupingBy(
                        str -> str, // Group by the string itself
                        Collectors.counting() // Count occurrences of each string
                ));
    }
}