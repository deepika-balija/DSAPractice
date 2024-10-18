package com.practice;

import java.util.Arrays;

public class StringCompress {

    public static void main (String[] args){
        String input ="aabbaacc";
        System.out.println(findingStringCompress(input));
    }

    private static String findingStringCompress(String input) {
      char[] chars = input.toCharArray();
      Arrays.sort(chars);
      String str=new String(chars);
      int count=1;
      StringBuilder sb = new StringBuilder();
      for (int i = 1; i < str.length(); i++) {
          char ch = str.charAt(i);
          if(str.charAt(i) == str.charAt(i-1)){
             count++;
          }else {
              sb.append(str.charAt(i-1)).append(count);
              count = 1;
          }
      }
      return sb.append(str.charAt(str.length()-1)).toString();
    }
}
//"Convert a string as given in the format below:
//
//Example:
//aabbb into a2b3
//aaaa into a4
//a into a1"