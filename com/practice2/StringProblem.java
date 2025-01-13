package com.practice2;

import java.util.HashMap;
import java.util.Map;

public class StringProblem {
    public static void main(String[] args){
        String s= "aabbbbbcc";
        //e string lo max occurrence char enti , length of it and starting index
        System.out.println(findingOccurence(s));

    }

    private static int findingOccurence(String s) {

        Map<Character, Integer> charCount= new HashMap<>();
                for(int i=0; i< s.length(); i++){
                    char c= s.charAt(i);
                    charCount.put(c, charCount.getOrDefault(c,0)+1);
                }

                char maxChar=' ';
                int maxCount=0;

                for(Map.Entry<Character, Integer> entry: charCount.entrySet()) {
                    if (entry.getValue() > maxCount){
                        maxChar= entry.getKey();
                        maxCount = entry.getValue();
                    }
                }
       // str iterate avvi if macChar==s.charAt(i) ithey then index =i cheynadi
                int index =0;
                for(int i=0; i< s.length();i++){
                    if(maxChar == s.charAt(i)){
                        index=i;
                        break;
                    }
                }
                System.out.println("the repeated char is: "+maxChar);
                System.out.println("the index of "+maxChar+" is "+index);
                return maxCount;
    }


}
