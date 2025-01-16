package com.practice2;

public class LengthOfLongestWord {
    public static void main(String[] args){
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        System.out.println(findingLengthOsLongWord(dict,toSearch));
    }

    private static int findingLengthOsLongWord(String[] dict, String toSearch) {
        int length=Integer.MIN_VALUE;
        for(int i=0; i< dict.length; i++){
            if(dict[i].toLowerCase().contains(toSearch.toLowerCase()))
                length = Math.max(length, dict[i].length());
        }
        return length;
    }
}
//"Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.

//Example:
//String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
//String toSearch = "ODG";
//
////Returns 9 (LODGESSSS)"