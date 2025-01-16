package com.practice2;

import java.util.ArrayList;
import java.util.List;

public class PrefixSearch {
    public static void main(String[] args){
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        System.out.println(findingPrefixContainsWord(arr, prefix));

    }

    private static List<String> findingPrefixContainsWord(String[] arr, String prefix) {
        List<String> list = new ArrayList<>();
        for(String word: arr){
            if(word.startsWith(prefix)){
                list.add(word);
            }
        }
        return list;
    }
}
//"Prefix Search
//Given a document and a prefix, return all the words starting with the prefix.
//
//        Example:
//Say the document is a string of words,
//String[] arr = {""apple"", ""applet"", ""bread"", ""aper""};
//String prefix = ""app"";

// Return apple, applet"