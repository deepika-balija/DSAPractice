package datastructures;

import java.util.Arrays;

public class StairCaseProblemOtherApproach {


        public static void main(String[] args) {
          int n=5;
            System.out.println(calculateNumOfWays(n));
        }

    private static int calculateNumOfWays(int n) {
           int ways[]= new int[n+1];
         ways[0]=1;
         ways[1]=1;

         for(int i=2;i<=n;i++) {
             ways[i]=ways[i-1]+ways[i-2];
         }
return ways[n];
}
}
//"A staircase with n steps is given. Starting from the base,
//        return the number of ways of reaching the n’th stair.
//                     [The person can climb either 1 or 2 stairs in one move]."