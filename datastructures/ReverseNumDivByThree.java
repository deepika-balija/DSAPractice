package datastructures;

public class ReverseNumDivByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="12345632189";
	
	System.out.println(reverseString(s));
		
		
		
	}

	private static String reverseString(String s) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder(s);
		
		StringBuilder divByThree = new StringBuilder();
	
		for(int i=0;i < sb.length(); i++) {
			char ch=sb.charAt(i);
			
			if(Character.isDigit(ch) && ch % 3 ==0) {
				divByThree.append(ch);
				System.out.println(divByThree);
				
			}
		}
		
		divByThree.reverse();
		System.out.println(divByThree);
		
		int index=0;
		for(int i=0; i< sb.length();i++) {
			char ch= sb.charAt(i);
			if( ch % 3 ==0 ) {
				sb.setCharAt(i, divByThree.charAt(index++));
			}
		}
		
		
		return sb.toString();
	}

}
