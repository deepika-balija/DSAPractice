package datastructures;

public class BinarySearch {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,5,7,9,11,23};
		System.out.print(findmedian(nums));
	}

	private static int findmedian(int[] nums) {
		// TODO Auto-generated method stub
		int n=nums.length;
		int median=0;
		if(n%2 == 0) {
		 median = n/2;
		}else {
			median = (n+(n-1))/2;
		}
		
		return median;
	}

}
