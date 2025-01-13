package com.StreamaPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArraytoMapExample {
    public static void main(String[] args){
        String input = "Geeks for Geek";

        Map<String, Integer> map= Arrays.stream(input.split(" "))
                .collect(Collectors.toMap(value -> value,
                        String::length));
        System.out.println("Arrays to map: "+map);

//        =======================================================
        System.out.println();

        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);

        Map<Integer, Integer> map1= inputList.stream()
                .collect(Collectors.toMap(value -> value, value -> value * value));
        System.out.println("with out Arrays to map: "+ map1);

//        =================================================================

        System.out.println();
        Integer[] inputArray = {1, 2, 3, 4, 5};
        Map<Integer, Integer> map2= Arrays.stream(inputArray)
                .collect(Collectors.toMap(value -> value, value -> value+10));
        System.out.println("with Integer Arrays to map: "+ map2);





    }
}
