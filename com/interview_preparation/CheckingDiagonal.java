package com.interview_preparation;

public class CheckingDiagonal {
    public static void main(String[] args){
        int matrix[][] = {
                {0,  1 , 0},
                {0, 8, 0},
                {0, 0, 3}
        };
        System.out.println(CheckingDiagonalMatrix(matrix));
    }

    private static boolean CheckingDiagonalMatrix(int[][] matrix) {

        int n= matrix.length;
        boolean isDiagonal =true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (i != j && matrix[i][j] != 0) {
                        isDiagonal = false;
                        break;
                    }
                }
                if (!isDiagonal) {
                    break;
                }
            }

        return isDiagonal;
    }
}
