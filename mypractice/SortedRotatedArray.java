package mypractice;

public class SortedRotatedArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 6, 9, 2, 3, 4}; 
		
		System.out.println(findingMinElement(arr));
	}

	private static int findingMinElement(int[] arr) {
		// TODO Auto-generated method stub
		int minEle= Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			minEle=Math.min(minEle, arr[i]);
		}
		return minEle;
	}

}

//"Given a sorted rotated array,
//return the minimum element from it.
//
//Examples:
//int[] arr1 = {5, 6, 1, 2, 3, 4};    //Return 1
//
//int[] arr2 = {1, 2, 3, 4};            //Return 1"