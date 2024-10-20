package mypractice;

public class MinDistBtwnWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "the quick the brown quick brown the frog";
		String word1 = "the";
		String word2 = "quick";
		
		 minDistBtwnWords(str,word1,word2);
		
	}

	private static void minDistBtwnWords(String str, String word1, String word2) {
		// TODO Auto-generated method stub
	String[] dist=str.split(" ");
	int word1Position=-1;
	int word2Position=-1;
	int minDist=Integer.MAX_VALUE;
	
	for(int i=0; i<=dist.length; i++) {
		if(dist[i].equals(word1) ) {
			word1Position=i;
			//System.out.println(word1Position);
		}else
		if(dist[i].equals(word2)) {
			word2Position=i;
			//System.out.println(word2Position);
		}
		if( !(word1Position == -1) && !(word2Position ==-1) ) {
			minDist = Math.min(minDist, Math.abs(word2Position-word1Position)-1);
			
		}
		
	}
	System.out.println(minDist);
	}

}


//"Given a sentence/phrase and two words,
//return the minimum distance between the words.
//
//Example:
//String str = “the quick the brown quick brown the frog”
//String word1 = “quick”
//String word2 = ""frog""

//Return 2"