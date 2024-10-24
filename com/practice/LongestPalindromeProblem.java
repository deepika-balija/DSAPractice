package com.practice;

public class LongestPalindromeProblem {
    public static void main(String[] args) {
String input = "forgeeksskeegfor";
        System.out.println(findingLongestPalindromeLength(input));
    }
public static String findingLongestPalindromeLength(String s) {
        if(s == null || s.length() == 0)
            return s;

       String lSP ="";
       for(int i=1;i<s.length();i++){
//for odd length
           int low =i;
           int high =i;
           while(s.charAt(low) == s.charAt(high)){
               low--;
               high++;
               //terminate the condition if we reach start /end of string
               if(low == -1 || high == s.length()){
                   break;
               }
               ///indexes low & high can be used to extract the substring
               String palindrome = s.substring(low+1,high);
               if(palindrome.length() > lSP.length()){
                   //capture the longest palindrome found
                   lSP = palindrome;
               }
           }
           // for even length
            low=i-1;
            high=i;

           while(s.charAt(low)==s.charAt(high)){
               low--;
               high++;
               if(low == -1 || high == s.length()){
                   break;
               }
               String palindrome = s.substring(low+1,high);
               if(palindrome.length() > lSP.length()){
                   lSP = palindrome;
               }
           }

       }
    System.out.println(lSP);
       return lSP;
}




}
