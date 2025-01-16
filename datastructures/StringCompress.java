package datastructures;

import java.util.Arrays;

public class StringCompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbbycyyc";
		System.out.println(stringCom(str));
	}

	private static String stringCom(String str) {
		// TODO Auto-generated method stub
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		int count=1;
		String input= new String(arr);
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=1; i< input.length(); i++) {
			char ch =input.charAt(i);
			
			if(input.charAt(i) == input.charAt(i-1)) {
				count++;
			}else {
				sb.append(input.charAt(i-1)).append(count);
			//	System.out.println(sb);
				count=1;
			}	 
		}
		//System.out.println(sb);
		 sb.append(input.charAt(input.length() - 1)).append(count);
		//System.out.println(sb);
		 
		return sb.toString();
	}

}
