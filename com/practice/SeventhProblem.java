package com.practice;

import java.util.ArrayList;
import java.util.List;

public class SeventhProblem {
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        startingWithPrefix(arr,prefix);

    }

    private static List<String> startingWithPrefix(String[] arr, String prefix) {
        List<String> list = new ArrayList<String>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i].startsWith(prefix)){
                list.add(arr[i]);
            }

        }
        System.out.println(list);
        return list;
    }
}
//"Prefix Search
//Given a document and a prefix, return all the words starting with the prefix.
//
//        Example:
//Say the document is a string of words,
//String[] arr = {"apple", "applet", "bread", "aper"};
//String prefix = "app";

// Return apple, applet"