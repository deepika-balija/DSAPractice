package com.practice;

public class MatrixSum {
    public static void main(String args[]){
        int [][]mat={{10, 10, 2, 0, 20, 4},
                {1,  0,  0, 30, 2, 5},
                {0,  1,  4, 0,  2, 0},
                {1,  0,  2, 20, 0, 4}};
        System.out.println(findMatrixMaxSum(mat));
    }

    private static int findMatrixMaxSum(int[][] mat) {
        int m =mat.length;
        int n = mat[0].length;
        int dp[][] = new int[m][n];

        for(int j=0;j<n;j++){
          dp[0][j]  = mat[0][j];
        }
         for(int i=1; i< m; i++){
             for(int j=0;j<n;j++){
                 dp[i][j] = dp[i-1][j]+mat[i][j];//up
                 if(j>0){
                     dp[i][j] = Math.max(dp[i][j] ,dp[i-1][j-1] +mat[i][j]);// top-left
                 }
                 if(j<n-1){
                     dp[i][j] = Math.max(dp[i][j], dp[i-1][j+1] + mat [i][j]);
                 }

             }

         }
         int maxSum = Integer.MIN_VALUE;
         for(int j=0; j<n; j++){
             maxSum = Math.max(maxSum, dp[m-1][j]);
         }
return maxSum;
    }
}