package datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MaximunUsingDeque {

	public static int[] maxSlidingWindow(int[] input, int k) {
		
		Deque<Integer> deque =new LinkedList();
		
		 int[] result= new int[input.length -k +1]; 
		 
		 int resultIndex=0;
		 
		 for(int i =0; i< input.length;i++) {
			 if(!deque.isEmpty() && deque.peekFirst() <i-k +1) {
				 deque.pollFirst();
			 }
			 
			 while(! deque.isEmpty() && input[deque.peekLast()] <= input[i]) {
				 deque.pollLast();
			 }
			 deque.offerLast(i);
		 System.out.println(deque);
		if(input.length >= k -1) {
			result[resultIndex++]= input[deque.peekFirst()];
		}
		 }
		return result;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input= {1,3,-1,-3,5,3,6,7};
		int k = 3;
		
		System.out.println(maxSlidingWindow(input,k));
	}

}
