package mypractice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaaabcbded";
		FindFrstNonRepeatChar(input);
	}

	private static void FindFrstNonRepeatChar(String input) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> charFreq= new HashMap<>(); 
		for(char ch:input.toCharArray()) {
			charFreq.put(ch, charFreq.getOrDefault(ch, 0)+1);	
		}
		//System.out.println(charFreq);
		for(char ch:input.toCharArray()) {
			if(charFreq.get(ch) == 1) {
				System.out.println(ch);  
				break;
			}
		}	
	}
}



//"Given a string,
//return the first non-repeating character.
//
//Examples:
//String str1 = ""12345""
////Return 1
//
//String str2 = ""abbacd""
//Return c"