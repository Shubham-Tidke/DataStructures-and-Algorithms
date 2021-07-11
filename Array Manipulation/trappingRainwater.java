/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 * https://leetcode.com/problems/trapping-rain-water/
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1] Output: 6 
 * Explanation: The above elevation map (black section) 
 * is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
 * In this case, 6 units of rain water (blue section) are being trapped.
 */
public class trappingRainwater {
	public static void main(String[] args) {
		int []height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(getTrappedWater(height));
	}
	private static int getTrappedWater(int[] height) {
		int trappedWater = 0;
		for (int i = 1; i < height.length-1; i++) {
			
			int leftHigh = height[i];
			for (int j = 0; j < i; j++) {
				leftHigh = Math.max(leftHigh, height[j]); //get left max 
			}
			
			int rightHigh = height[i];
			for (int j = i+1; j < height.length; j++) {
				rightHigh = Math.max(rightHigh, height[j]); // get right max
			}
			//System.out.println(leftHigh+"-"+rightHigh);
			trappedWater += Math.min(leftHigh, rightHigh) - height[i];
			
		}
		return trappedWater;
	}

}
