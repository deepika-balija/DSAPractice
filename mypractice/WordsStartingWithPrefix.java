package mypractice;

import java.util.ArrayList;
import java.util.List;

public class WordsStartingWithPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] document= {"apple", "applet", "bread", "aper","baapp"};
	String prefix = "app";
	System.out.println(findingWordsWithPrefix(document,	prefix ));
	
	}

	private static List<String> findingWordsWithPrefix(String[] document, String prefix) {
		// TODO Auto-generated method stub
		int len=document.length;
		List<String> result =new ArrayList<String>();
		for(int i=0;i<len;i++) {
			//if(document[i].contains(prefix)) {
			if(document[i].startsWith(prefix)) {
				result.add(document[i]);
			}
		}
		return result;
	}

}

//	"Prefix Search
//    Given a document and a prefix, return all the words starting with the prefix.
//
//Example:
//Say the document is a string of words,
//    String[] arr = {""apple"", ""applet"", ""bread"", ""aper""};
//    String prefix = ""app"";

// Return apple, applet"