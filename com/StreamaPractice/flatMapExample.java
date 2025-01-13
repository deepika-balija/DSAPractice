package com.StreamaPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMapExample {
    public static void main(String[] args){
        // Creating a Map where values are lists of integers
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("Group1", Arrays.asList(1, 2, 3));
        map.put("Group2", Arrays.asList(4, 5));
        map.put("Group3", Arrays.asList(6, 7, 8));

        // Print the original map
        System.out.println("Original Map: " + map);
        System.out.println("\nAfter using flatmap ");

        List<Integer> list = map.values()
                .stream()
                .flatMap(Collection::stream)  // flatMap(c->c.stream())
                .toList();           //collect(Collectors.toList())
        System.out.println(list);

//========================================================
        System.out.println("\n");

        Integer[] array1 = {11, 21, 31};
        Integer[] array2 = {44, 54, 64};

        System.out.println("Flatten Arrays: "+ flattenArrays(array1, array2));
    }

    private static List<Integer> flattenArrays(Integer[] array1, Integer[] array2) {
        return Stream.of(array1,array2)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }

}
