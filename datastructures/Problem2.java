package datastructures;

public class Problem2 {

	public static int getMaxCardPoints(int[] input, int noOfCards) {
		int  n = input.length;
		int totalSum= 0;
		
		for(int point: input) {
			totalSum +=point;
		}
		
		if( noOfCards == n) {
			return totalSum;
		}
		
		int windowSize = n-noOfCards;
		int minWindowSum= 0;
		
		for(int i=0; i<windowSize; i++) {
			minWindowSum += input[i];
		}
		
		int currentWindowSum = minWindowSum;
		for(int i=windowSize; i<n; i++) {
			currentWindowSum += input[i] -input[i-windowSize];
			minWindowSum =Math.min(minWindowSum, currentWindowSum);
		}
		return totalSum - minWindowSum;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[]= {3,5,9,9,9,6,4};
		int noOfCards=4;
		System.out.println(getMaxCardPoints(input, noOfCards));
	}

}
