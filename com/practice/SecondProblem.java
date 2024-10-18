package com.practice;

public class SecondProblem {
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        System.out.println(longestWord(dict, toSearch));
//        System.out.println(longWordWithOutUsingContainsMethod(dict, toSearch));
    }

//    private static int longWordWithOutUsingContainsMethod(String[] dict, String toSearch) {
//        for (int i = 0; i <= dict.length() - toSearch.length(); i++) {
//            // Extract a substring of s1 of the same length as s2
//            String sub = s1.substring(i, i + s2.length());
//
//            // If the substring matches s2, return true
//            if (sub.equals(s2)) {
//                return true;
//            }
//        }

//        // If no match found, return false
//        return false;
//    }
//
//        return   0;
//    }

    private static int longestWord(String[] dict, String toSearch) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < dict.length; i++) {
            if (dict[i].toLowerCase().contains(toSearch)) ;
//            int len = dict[i].length();
            result = Math.max(result, dict[i].length());
        }
        return result;
    }
}

//"Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.
//
//Example:
//String[] dict = {""CODGE"", ""ODG"", ""LODGES"", ""SODG"", ""dodge"", ""mODJ"", ""LODGESSSS""}
//String toSearch = ""ODG"";

//Returns 9 (LODGESSSS)"