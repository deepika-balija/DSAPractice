package com.practice;
//to find longest sub array sum
public class KadansAlgorithms {
    public static void main(String args[]){
        int arr[]={-3,2,4,-1,3,-4,3};
        System.out.println(findSumOfLongestSubArray(arr));
    }

    private static int findSumOfLongestSubArray(int[] arr) {
        int sum=0;
        int max =Integer.MIN_VALUE;
        for(int i =0; i< arr.length; i++){
            if(sum>0){
                sum+=arr[i];
            }else{
                sum=arr[i];
            }
            if(max < sum){
                max =sum;
            }
        }
        return max;
    }
}
