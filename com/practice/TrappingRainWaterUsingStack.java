package com.practice;

import java.util.Stack;

public class TrappingRainWaterUsingStack {
    public static void main(String args[]){
      int[]  height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(findingTrappingRainWater(height));

    }

    private static int findingTrappingRainWater(int[] height) {
        Stack<Integer> st= new Stack<>();
        int totalWater=0;
        int m=0;
        for(int i=0; i< height.length; i++){

//
            while( !st.isEmpty() && height[i] > height[st.peek()]){
                m =st.pop();
                if(st.isEmpty()) break;
                int depth= Math.min(height[i] ,height[st.peek()]) -height[m];
                int width = i-st.peek()-1;
                totalWater+= depth* width;
            }
            st.push(i);

        }
        return totalWater;
    }
}
//Stack will store indexes
//Current : Element being evaluated viz i: in for loop
//Top: Element at top of Stack
//Left: Element to left of stack
//
//
//If the height is decreasing add to stack
//
//else
//loop while current > Top or stack is empty
//water at Element at top = depth * width
//Basin Height = (lesser of current element and element to left of top) - top
//        depth = basin height - top
//        width = i -left -1
//
//update total