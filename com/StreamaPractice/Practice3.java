package com.StreamaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice3 {
    public static void main(String[] args){
//        Partition a list of integers into two groups: one group containing
//        even numbers and the other containing odd numbers.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
       Map<Boolean, List<Integer>> partition = numbers.stream()
                .collect(Collectors.partitioningBy(n->n%2 ==0));
        System.out.println(partition);

    }
}
