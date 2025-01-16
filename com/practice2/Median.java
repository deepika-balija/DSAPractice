package com.practice2;

public class Median {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 5, 8};
        int arr2[] = {10, 12, 14, 16, 18, 20};
        System.out.println(findingMedianOfSortedArray(arr1, arr2));
    }

    private static int findingMedianOfSortedArray(int[] arr1, int[] arr2) {
        int median = 0;
        int m = arr1.length;
        int n = arr2.length;
        int finalArray[] = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                finalArray[k] = arr1[i];
                i++;
                k++;
            } else {
                finalArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            finalArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            finalArray[k] = arr2[j];
            j++;
            k++;
        }
        int len = finalArray.length;
        if (len % 2 == 0) {
            median = (finalArray[len / 2] + finalArray[len / 2 - 1]) / 2;
        } else{
            median = finalArray[len / 2];
    }

    return median;
}
}
//"Find the median of two sorted arrays of different sizes.
//
//Example:
//arr1[] = {2, 3, 5, 8}
//arr2[] = {10, 12, 14, 16, 18, 20}

//Return 11 as the median"
