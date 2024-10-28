package datastructures;

import java.util.Arrays;

public class LengthOfLoop {
    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};
        System.out.println(lengthOfLoop(arr));
    }
    private static int lengthOfLoop(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int index = i;
            while (!visited[index]) {
                visited[index] = true;
                count++;

                if (arr[index] >= 0) {
                    index = (index + arr[index]) % n;
                } else {
                    index = (index - arr[index]) % n;
                }
                if (index < 0) {
                    index += n;
                }
            }
            if (index == i) {
                return count;
            }
        }
        return -1;
    }
}
//"Given an array of integers (positive and negative),
//        return length of the loop, if it exists. Else return -1.
//        [ Rules for the movement - Index to move to,
//        for +ve numbers - (i + arr[i])%n
//        for -ve numbers - (i - arr[i])%n ]
//
//Example:
//int[] arr = {2, -1, 1, 2, 2}
//// Returns 3  [There is a loop in this array because 0 moves to 2, 2 moves to 3, and 3 moves to 0.]"