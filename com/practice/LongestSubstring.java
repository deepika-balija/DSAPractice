package com.practice;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "aabbbbCCddd";
        int[] result=findLongestSubstring(str);
        System.out.println(result[1]);
    }

    private static int[] findLongestSubstring(String str) {
        int maxStart=0;
        int maxLength=1;
        int currentLength=1;
        int currentIndex=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                currentLength++;
            }else{
                if(currentLength>maxLength){
                    maxLength=currentLength;
                    maxStart=currentIndex;
                }
                currentLength=1;
                currentIndex=i;
            }

        }
        if(currentLength>maxLength){
            maxLength=currentLength;
            maxStart=currentIndex;
        }
        return new int[]{maxStart, maxLength};
    }
}
//"Given a string,
//        return the starting index & length of the longest substring containing the same character.
//
//        Example:
//String[] str = ""aabbbbCCddd"";    // Return 2 (index) and substring ""bbbb"""