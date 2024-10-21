package datastructures;

public class slidingWindow {

	public static int slidingWindow(int[] elements, int k) {
		int result =0;
		int window=0;
		for(int i=0; i<k; i++) {
			window +=elements[i];
			result = window;
		}
		
		for(int i=1; i< elements.length-k+1; i++) {
			window = window - elements[i-1] -elements[1+k-1];
			if(window > result) {
				result= window;
			}
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int elements[]= {3,5,9,9,9};
		int k=4;
		System.out.println(slidingWindow(elements, k));

	}

}
