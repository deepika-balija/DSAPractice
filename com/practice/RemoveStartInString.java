package com.practice;

import java.util.Stack;

public class RemoveStartInString {
    public static void main(String args[]){
        String s = "leet**cod*e";
        System.out.println(removingStartFromString(s));
        System.out.println(removingStartFromStringUsingStack(s));
    }

    private static String removingStartFromString(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i< s.length(); i++){
            char ch= s.charAt(i);
            if(ch =='*'){
                if(sb.length()>0){
               sb.deleteCharAt(sb.length()-1) ;}
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    private static String removingStartFromStringUsingStack(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0; i< s.length();i++){
            char ch= s.charAt(i);
            if(ch == '*' && st.size()>0){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb= new StringBuilder();
        while(st.size() !=0){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
