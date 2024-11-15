package com.practice;

import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;

public class TemperaturesProblem {
    public static void main(String args[]){
     int   temp[] = {73,74,75,71,69,72,76,73};
//     int[] res=
        System.out.println(Arrays.toString(findingWarmerTempDay(temp)));

    }

    private static int[] findingWarmerTempDay(int[] temp) {
        int n = temp.length;
        //initialize the empty stack to store the indices of days
        Stack<Integer> st =new Stack<>();
        int res[] =new int[n];
        for(int i=0; i<n; i++){
            // curTem is greater than the temperature at the index stored at the top of stack
            while(!st.isEmpty() && temp[i]> temp[st.peek()]){
                //remove the top index from stack and store it in index
                int index= st.pop();
                res[index]=i-index;

            }
            st.push(i);

        }

return res;
    }
}
;