import java.util.Scanner;

/*
Problem Statement -

Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
A subarray is defined as a contiguous sequence of numbers in an array.

Example 1:
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.

Example 2:
Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.

Example 3:
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
 */
public class MaxAscendingSubArr {
	public static void main(String[] args) {
		int nums[] = {10,20,30,5,10,50};
		System.out.println(getMaxSumAsc(nums));
	}
	private static int getMaxSumAsc(int[] nums) {
		int sum = nums[0];int temp =nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]>nums[i-1])
			{
				temp+=nums[i];
			}
			else
				temp=nums[i];
			sum = Math.max(temp, sum);
		}
		return sum;
	}
}
