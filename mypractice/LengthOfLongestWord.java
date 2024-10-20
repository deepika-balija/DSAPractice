package mypractice;

public class LengthOfLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodgehj", "mODJ", "LODGESSSS"};
		String toSearch = "ODGe";
		System.out.println(longestWord(dict,toSearch));
	}

	private static int longestWord(String[] dict, String toSearch) {
		// TODO Auto-generated method stub
	
		int result=Integer.MIN_VALUE;
		for(int i=0;i<dict.length;i++) {
		if(dict[i].toLowerCase().contains(toSearch.toLowerCase())) {
			int l=dict[i].length();
			result=Math.max(result, l);
		}
		}
		return result ;
	}

}



//"Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.
//
//Example:
//String[] dict = {""CODGE"", ""ODG"", ""LODGES"", ""SODG"", ""dodge"", ""mODJ"", ""LODGESSSS""}
//String toSearch = ""ODG"";
//
////Returns 9 (LODGESSSS)"