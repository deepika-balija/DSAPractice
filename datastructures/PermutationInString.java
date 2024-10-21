package datastructures;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {

		
	public static boolean checkingString(String s1, String s2) {
		
		int  len1= s1.length();
		int len2 = s2.length();
		
		if(len1 > len2) {
			return false;
		}
		
		Map<Character, Integer> s1Freq= new HashMap<>();
		for(char c: s1.toCharArray()) {
			s1Freq.put(c, s1Freq.getOrDefault(c, 0) + 1);
		}
		
		Map<Character, Integer> s2Freq= new HashMap<>();
		for(int i =0; i< len1; i++) {
			char c= s2.charAt(i);
			s2Freq.put(c, s2Freq.getOrDefault(c, 0) + 1);
		}
		
		if(s1Freq.equals(s2Freq)) {
			return true;
		}
		
		//sliding window
		for(int i=len1; i< len2; i++) {
		char newChar= s2.charAt(i);
		s2Freq.put(newChar, s2Freq.getOrDefault(newChar, 0) + 1);
		
		char oldChar = s2.charAt(i -len1);
		s2Freq.put(oldChar, s2Freq.get(oldChar) -1);
		
		
		if(s2Freq.get(oldChar)==0) {
			s2Freq.remove(oldChar);
		}
		if(s1Freq.equals(s2Freq)) {
		return true;
		}
		}
		return false;
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s1 = "baa";
	        String s2 = "eidbaooo";
	        System.out.println(checkingString(s1, s2));
	}

}
