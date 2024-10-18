package com.practice;

public class EleventhProblem {
    public static void main(String[] args) {
        int[] arr = { 1,2, 3, 4};
        System.out.println(minEleFromRotatedArr(arr));
    }

    private static int minEleFromRotatedArr(int[] arr) {

        int left =0;
        int right =arr.length-1;
        int min =Integer.MAX_VALUE;
        if(arr[left] >arr[right]){
        while(left <right) {
            int  mid = left+right/2;
            if(arr[mid] < arr[right]) {
                right=mid-1;
            }else {
                left=mid+1;
            }
           min=Math.min(arr[mid],min) ;
        }
            return min;
        }else
            return arr[left];

    }
}
//"Given a sorted rotated array,
//        return the minimum element from it.
//
//        Examples:
//int[] arr1 = {5, 6, 1, 2, 3, 4};    //Return 1
//
//int[] arr2 = {1, 2, 3, 4};            //Return 1"