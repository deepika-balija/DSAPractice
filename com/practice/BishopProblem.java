package com.practice;

public class BishopProblem {
    public static void main(String[] args){
        System.out.println(canReachBishop(1, 1, 4, 4)); // "YES, 1" (same diagonal)
        System.out.println(canReachBishop(1, 1, 2, 3)); // "NO" (different color)
        System.out.println(canReachBishop(1, 1, 2, 4)); // "YES, 2" (same diagonal)
        System.out.println(canReachBishop(1, 1, 5, 5)); // "YES, 1" (same diagonal)
    }

    private static String canReachBishop(int br, int bc, int tr, int tc) {
        // if they are in same colour
        if(Math.abs(br-bc) ==Math.abs(tr-tc)){
            return "Yes,1";
        } else if ((bc +br)%2 == (tc+tr)%2 ){ // if they  are in diff colour
            return "Yes,2";

        }else {
            return "No";
        }
    }


}
//"We are given a chess board and a piece with a fixed position (immoveable). We also have a bishop on the board which, well of course, can only move diagonally.
//        - Return ""YES"" if we can reach the immoveable piece using the bishop, else return ""NO"".
//        - If ""YES"", return the number of minimum steps it takes for the bishop to reach the immoveable piece."