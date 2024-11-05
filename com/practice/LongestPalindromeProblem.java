package com.practice;

public class LongestPalindromeProblem {
    public static void main(String[] args) {
        String input = "forgeeksskeegfor";
        System.out.println(findingLongestPalindromeLength(input));

        System.out.println(findingLongestPalindromeLength(input).length());
    }

    public static String findingLongestPalindromeLength(String s) {
        if (s == null || s.length() == 0)
            return s;
//        int n = s.length() - 1;
        int maxlen = 1;
        int startindex = 0;
        for (int i = 0; i < s.length()-1 ; i++) {
            //for even length
            int low = i;
            int high = i + 1;
            int len = expandAround(s, low, high);
           if (len > maxlen) {
               maxlen = len;
               startindex = i -(maxlen-1)/2;
           }


        }
        for(int i=1; i< s.length()-1; i++){
            int low = i-1;
            int high = i+1;
            int len = expandAround(s, low, high);
            if (len > maxlen) {
                maxlen = len;
                startindex = i -(len-1)/2;
            }

        }
        return s.substring(startindex, startindex+maxlen);
    }
        public static int expandAround(String s, int low, int high){
            while (low>=0 &&  high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;

            }
            return high-low-1;
        }



}