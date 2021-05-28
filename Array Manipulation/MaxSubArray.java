/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 *  which has the largest sum and return its sum.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:
Input: nums = [1]
Output: 1
Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
 */
public class MaxSubArray {
	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(getSum(arr));
	}
	private static int getSum(int[] arr) {
		int sum = Integer.MIN_VALUE;
		int temp_max =0;
		for (int i = 0; i < arr.length; i++) {
			temp_max+=arr[i];
			if(sum<temp_max)
				sum=temp_max;
			if(temp_max<0)
				temp_max = 0;
		}
		return sum;
	}
}