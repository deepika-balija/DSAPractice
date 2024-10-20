package mypractice;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
	
public static String reverseVowels(String str) {
	Set<Character> vowels=new HashSet<>();
	vowels.add('a');
	vowels.add('e');
	vowels.add('i');
	vowels.add('o');
	vowels.add('u');
	vowels.add('A');
	vowels.add('E');
	vowels.add('I');
	vowels.add('O');
	vowels.add('U');
	
	char[] ch=str.toCharArray();
	int left=0;
	int right=str.length()-1;
	
	while(left < right) {
		
		if(! vowels.contains(ch[left])) {
			left++;
		}else if(! vowels.contains(ch[right])) {
			right--;
		}
	
	char temp= ch[left];
	ch[left] = ch[right];
	ch[right] = temp;
	left++;
	right--;
	}
	String result=String.copyValueOf(ch);
	
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="leetcode";
		System.out.println(reverseVowels(st));
	}

}
