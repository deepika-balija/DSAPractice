package com.practice;

import java.util.Arrays;

public class StairCaseProblem {
   static int strg[] ;

        public static void main(String[] args) {
          calculateNumOfWays();
        }

    private static void calculateNumOfWays() {
            int n=5;
            strg = new int[n+1];
        Arrays.fill(strg, -1);
        int numOfWays = solve(n);
        System.out.println(numOfWays);
    }
static int solve(int n) {
          if(n == 1 || n == 2) {
              return n;
          }
          if(strg[n] != -1) {
              return strg[n];
          }
          int way1=solve(n-1);
          int way2 = solve(n-2);
          return way1+way2;
}
}
//"A staircase with n steps is given. Starting from the base,
//        return the number of ways of reaching the n’th stair.
//        [The person can climb either 1 or 2 stairs in one move]."