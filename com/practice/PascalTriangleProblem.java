package com.practice;

import java.util.Arrays;

public class PascalTriangleProblem {
    
    public static void main(String[] args) {
//        int[] arr ={1};
//        int res[]=getRows(arr);
//
//        System.out.println(getRows(arr));
//        for(int i=0; i<res.length; i++){
//
//            System.out.print(res[i]+" ");
//
//        }
        printTriangle(6);
    }
    public static int[] getRows(int[] prev){
        int[] res = new int[prev.length+1];
        for(int i=0; i<res.length; i++) {
            if (i == 0) {
                res[i] = prev[0];
            } else if (i==res.length-1) {
                res[i] = prev[prev.length - 1];
            } else  {
                res[i] = prev[i] + prev[i-1];
            }
        }
        return res;
    }

    public static void printTriangle(int n){
int input[]= new int[]{1};
        System.out.println(Arrays.toString(input));
for(int i=0; i<n; i++){
    input=getRows(input);
    System.out.println(Arrays.toString(input));
}

    }
}
