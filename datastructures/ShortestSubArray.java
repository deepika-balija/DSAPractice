package datastructures;

public class ShortestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {2, 4, 6, 10, 2, 1}; 
				 int K = 12 ;
				 System.out.println(lengthOfShortSubSrray(arr, K));
	}

	private static int lengthOfShortSubSrray(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		int left =0;
		int sum=0;
		int minLength= Integer.MAX_VALUE;
		
		for(int right =0 ; right<arr.length; right++) {
			sum+=arr[right];
			
			while(sum >= k) {
				if(sum == k) {
					minLength =Math.min(minLength, right-left+1);
			}
				sum-=arr[left];
				left++;
			}
		}
		//System.out.println(minLength);
		//If it doesn't exist, return -1. 

		if(minLength==Integer.MAX_VALUE) {
			return -1;
		}
		return minLength ;
	}

}
