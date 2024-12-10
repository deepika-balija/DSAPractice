package com.practice;

public class SegregatePositivesNegatives {
public static void main(String[] args) {
    int[] input = {-1, 2, 3, -5, 4, 8, -6};
    int[] result = seggregatePositiveAndNegative(input);
    for(int i:result) {
        System.out.print(i+" ");
    }
}

    private static int[] seggregatePositiveAndNegative(int[] input) {
    int left =0;
    int right=input.length-1;
   while(left<right){
        if(input[left] <0 && input[right]>0){
            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }else if(input[left]>0){
            left++;
        } else if (input[right]<0) {
            right--;
        }
   }
   return input;
    }

}
