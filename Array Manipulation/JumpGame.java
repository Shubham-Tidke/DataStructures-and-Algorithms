/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index.

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class JumpGame {

	public static void main(String[] args) {
		int nums[] = {3,2,1,0,4};
		System.out.println(canJump(nums));
	}
	public static boolean canJump(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if(i>max)
				return false;
			max = Math.max(max, nums[i]+i);
		}
		return true;
	 }
}
