package com.practice;

public class FifthProblem {
    public static void main(String[] args) {
       int arr1[] = {2, 3, 5, 8};
        int arr2[] = {10, 12, 14, 16, 18, 20};
        findingMedianOfTwoArrays(arr1, arr2);

        }


    private static void findingMedianOfTwoArrays(int[] arr1,int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int i =0; int j =0;int k=0;
        int finalArray[] =new int[arr1Length +arr2Length];
        while (i < arr1Length &&  j< arr2Length) {
            if(arr1[i] < arr2[j]) {
                finalArray[k] = arr1[i];
                i++;
                k++;
            }
            else {
                finalArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1Length) {
            finalArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2Length) {
            finalArray[k] = arr2[j];
            j++;
            k++;
        }
        int median=0;
        for(int res : finalArray) {
            int length= finalArray.length;

           if(length % 2 == 0) {
               median = (finalArray[length/2] + finalArray[length/2-1]) / 2;
           }
           else {
               median = finalArray[length/2];
           }

        }
        System.out.println(median);
    }
}

//"Find the median of two sorted arrays of different sizes.
//
//Example:
//arr1[] = {2, 3, 5, 8}
//arr2[] = {10, 12, 14, 16, 18, 20}

//Return 11 as the median"