package com.StreamaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstExample {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        Optional<String> firstWord = words.stream()
                .reduce((first, second) -> first);
        firstWord.ifPresent(word -> System.out.println("First word with reduce(): " + word));
        System.out.println("the first element: "+firstWord);

//        =====================================================================

        Optional<String> firstWord1= words.stream()
                .findFirst();

        firstWord.ifPresent(word -> System.out.println("First word using FindFirst(): " + word));

    }
}
