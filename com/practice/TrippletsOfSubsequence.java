package com.practice;

public class TrippletsOfSubsequence {
    public static void main(String args[]){
      int[]  nums = {2,1,5,0,4,6};
        System.out.println(checkingTripplets(nums));
    }

    private static boolean checkingTripplets(int[] nums) {
        int n = nums.length;
        for(int i=0; i< n-2;i++){
            if(nums[i]<nums[i+1] && nums[i+1]<nums[i+2]){
                return true;
            }
        }
        return false;
//        int[] leftMin = new int[n];
//        leftMin[0] =nums[0];
//        for (int i = 1; i < n; i++ ){
//          leftMin[i] = Math.min(leftMin[i-1],nums[i]);
//
//        }
//
//        int[] rightMax= new int[n];
//        rightMax[n-1] = nums[n-1];
//        for(int j=n-2; j>0; j--){
//            rightMax[j] =Math.max(rightMax[j+1], nums[j] );
//        }
//
//
//        for(int i=0;i< n;i++) {
//            if (nums[i] != leftMin[i] && nums[i] != rightMax[i] ){
//                return true;
//            }
//
//        }
//        return false;

    }
}
