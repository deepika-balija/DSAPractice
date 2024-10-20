package mypractice;

public class StringCompress {

	public static String stringCom(String str) {
	
		if(str == null && str.length() ==0) {
			return " ";
		} else {
			int count=1;
			StringBuilder sb= new StringBuilder();
			for(int i=1;i<str.length();i++) {
				if(i<str.length() && str.charAt(i) == str.charAt(i-1)) {
					count++;	
				}
				else {
					sb.append(str.charAt(i-1)).append(count);
					count=1;
				}
			}
			sb.append(str.charAt(str.length()-1)).append(count);
			return  sb.toString();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strn="aabbbaccccdddd";
		System.out.println(stringCom(strn));
		
		
		
		
		
	}

}
