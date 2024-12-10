package com.practice;

import java.util.*;

public class ArrayOfStrings {
    public static void main(String[] args) {
        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "dacb","acb", "acab"};
        String input = "abcd";
        System.out.println(Arrays.toString(findingArrayOfStrings(dict, input)));
    }

    private static String[] findingArrayOfStrings(String[] dict, String input) {
        List<String> list = new ArrayList<>();

         int inputFreqArr[] = new int[26];
        for(int i = 0; i < input.length(); i++) {
           char ch = input.charAt(i);
           int index = ch - 'a';
            inputFreqArr[index]++;
        }
 for(int i = 0; i < dict.length; i++) {
     String s = dict[i];
     int wordFreqArr[]= new int[26];
     if(s.length() ==input.length()){
         for(int j = 0; j < s.length(); j++) {

             char ch = dict[i].charAt(j);
             int index = ch - 'a';
             wordFreqArr[index]++;
         }
         if(Arrays.equals(inputFreqArr,wordFreqArr)){
             list.add(s);
         }

     }
 }
// return list.toArray(new String[0]);
        return list.toArray(new String[list.size()]);
    }
}

//"Given a dictionary (list of words) and a word,
//        return an array of strings that can be formed from the given word.
//        [Every letter in the input word can occur only once in the word to be returned].
//
//Examples:
//String[] dict = {""ab"", ""abcd"", ""bcdaf"", ""bcad"", ""acb"", ""acab""};
//String input = "abcd";
//// Return {""abcd"", ""bcad""}
//
//String[] dict =  {""ab"", ""abcd"", ""bcdaf"", ""bcad"", ""acaab"", ""acab""};
//String input = ""caab"";
//// Return {""acab""}"