package datastructures;

public class TrappedWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]  height = {0,1,0,2,1,0,1,3,2,1,2,1};
			System.out.println(findingTrappingRainWater(height));


	}
	public static int findingTrappingRainWater(int[] height) {
		int n =height.length;
		int leftMax[] = new int[n];
		int rigMax[] = new int[n];

		leftMax[0] = height[0];
		for(int i=1; i< height.length; i++){
			leftMax[i]= Math.max(leftMax[i-1], height[i]);
		}

		rigMax[n-1] = height[n-1];
		for(int i=n-2; i>=0; i--){
			rigMax[i]= Math.max(rigMax[i+1] , height[i]);
		}
		int trappedWater=0;
		for(int i=0; i< height.length; i++){
			trappedWater += Math.min(leftMax[i],rigMax[i]) -height[i];
		}
		return trappedWater;
	}

}
