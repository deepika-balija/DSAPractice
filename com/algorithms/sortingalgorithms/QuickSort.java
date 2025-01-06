package com.algorithms.sortingalgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

    int[] arr = {10, 7, 8, 9, 1, 5};
    int n = arr.length;
    System.out.println("Unsorted array: " + Arrays.toString(arr));
    quickSort(arr, 0, n - 1);
    System.out.println("Sorted array: " + Arrays.toString(arr));
}

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int piv = partition(arr, low,high);
            quickSort(arr, low, piv -1);
            quickSort(arr, piv + 1, high);

        }
    }

    private static int partition(int[] arr, int low, int high) {
        int piv =arr[high];
        int i = low -1;
        for(int j=low; j < high ; j++){
            if(arr[j] <= piv){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i+1;

    }

}
