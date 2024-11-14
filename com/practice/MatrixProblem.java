package com.practice;

public class MatrixProblem {
    public static void main(String[] args) {
        int[][] matrix= {{10, 10,  2 , 0, 20,  4},
                          {1,  0, 0, 30,  2 , 5},
                           {0, 10,  4,  0, 2,  0},
                           {1,  0,  2, 20,  0,  4}};
        System.out.println(findingMaxPathSum(matrix));

    }

    private static int findingMaxPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = matrix[0][0];
        for(int i=0; i<rows; i++) {

            for(int j=0; j<cols; j++) {
                int max = 0;
//               max = Math.max(max, matrix[i][j]+dp[i][j]);
                if(i==0 && j==0) {
                    continue;
                }
                if(i>0){ ///rows
               max   = Math.max(dp[i-1][j], max);
                }
                if(j>0){  //colms
                  max = Math.max(dp[i][j-1], max);
                }
                if(i>0 && j>0){ //diagonals
                    max= Math.max(dp[i-1][j-1], max);
                }
                dp[i][j]=matrix[i][j]+max;
            }
        }

        return dp[rows-1][cols-1];
    }
}


//"Given a matrix of size m * n,
//        return the maximum path sum in the matrix.
//    [You start from the top-left corner of the matrix and may up, down and diagonally].
//
//Example:
//Matrix      10 10  2  0 20  4
//        1  0  0 30  2  5
//        0 10  4  0  2  0
//        1  0  2 20  0  4
//
//// Return 74 [The maximum sum path is 20-30-4-20]"