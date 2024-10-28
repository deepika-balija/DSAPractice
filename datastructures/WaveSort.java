package datastructures;

import java.util.Arrays;

public class WaveSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        System.out.println(Arrays.toString(waveFormatSorting(arr)));
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int[] waveFormatSorting(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            if(i%2 == 0 && arr[i] < arr[i+1]) {
                   swap(arr, i, i+1);

            }
            if (i%2 != 0 && arr[i] > arr[i+1]) {
              swap(arr, i, i+1);
            }
        }
        return arr;
    }

}
//"Given an array of integers,
//sort it in a wave form.
//        [ The order of elements in a wave form:
//arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= ….. ]
//
//Example:
//int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
//Answer : arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR {20, 5, 10, 2, 80, 6, 100, 3}"