package datastructures;

public class Problem21 {

	public  static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        // Sum of the first k cards from the left
        int currentScore = 0;
        for (int i = 0; i < k; i++) {
            currentScore += cardPoints[i];
        }

        // This is our initial max score (all k cards taken from the left)
        int maxScore = currentScore;

        //Now, we start shifting cards from left to right
        for (int i = 0; i < k; i++) {
            // Subtract the card we "give up" from the left
            currentScore -= cardPoints[k - 1 - i];
            // Add the card we take from the right
            currentScore += cardPoints[n - 1 - i];

            // Update max score after each shift
            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cardPoints[]= {3,5,9,9,9,6,4};
		int k=4;
		System.out.println(maxScore(cardPoints, k));
	}

}
