package com.StreamaPractice;

//Find the sum of squares of odd numbers in a list.

import java.util.Arrays;
import java.util.List;

//Find the sum of squares of odd numbers in a list.

public class Practice2 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
     int sumOfSquaredIntegers =   numbers.stream()
                .filter(n-> n%2 != 0)
                .map(n->n*n)
                .reduce(0,Integer::sum);
        System.out.println(sumOfSquaredIntegers);
    }
}
