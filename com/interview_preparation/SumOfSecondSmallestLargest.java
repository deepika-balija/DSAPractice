package com.interview_preparation;

import java.util.Arrays;

public class SumOfSecondSmallestLargest {
    public static void main(String[] args){
        int[] array = {12, 3, 5, 7, 19}; //O.P = 17
        System.out.println("Sum of second smallest Elemnet and second largest element: "+findSumOfSecondSmallestAndSecondLargest1(array));
    }

    private static int findSumOfSecondSmallestAndSecondLargest(int[] array) {
        if(array.length< 2){
            throw new IllegalArgumentException("Array must have two elements");
        }
        Arrays.sort(array);
        int scndSmallestEle = array[1];
        int scndLargestEle = array[array.length -2];

        int result = scndSmallestEle +scndLargestEle;
        return result;

    }

    private static int findSumOfSecondSmallestAndSecondLargest1(int[] array) {
        if(array.length <2) {
            throw new IllegalArgumentException("Array must have two elements");
        }

        int smallest = Integer.MAX_VALUE;
        int scndsmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int scndLargest = Integer.MIN_VALUE;
        for(int num :  array) {
            if (num < smallest) {
                scndsmallest = smallest;
                smallest = num;
            } else if (num < scndsmallest && num != smallest) {
                scndsmallest = num;
            }
            if (num > largest) {
                scndLargest = largest;
                largest = num;
            } else if (num > scndLargest && num != largest) {
                scndLargest = num;

            }
        }
            return scndsmallest + scndLargest;
    }
}
