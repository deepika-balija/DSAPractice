package com.practice;

public class NinthProblem {
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
String word1 = "quick";
String word2 = "frog";
minDistBtwnTwoWords(str,word1,word2);
    }

    private static void minDistBtwnTwoWords(String str, String word1, String word2) {
       int minDist = Integer.MAX_VALUE;
        String[] words = str.split(" ");
        int w1Position=-1;
        int w2Position=-1;
        for(int i=0; i<words.length; i++) {
            if (words[i].equals(word1)) {
                w1Position = i;
            } else if (words[i].equals(word2)) {
                w2Position = i;
            }
            if (w1Position != -1 && w2Position != -1) {
                minDist = Math.min(minDist, Math.abs(w1Position - w2Position)-1);

            }
        }
        System.out.println(minDist);
    }
}
//"Given a sentence/phrase and two words,
//        return the minimum distance between the words.
//
//Example:
//String str = “the quick the brown quick brown the frog”;
//String word1 = “quick”;
//String word2 = "frog";

//Return 2"