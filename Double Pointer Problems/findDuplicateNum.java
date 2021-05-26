import java.util.HashSet;
import java.util.Set;

/*
 *Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.
Example 1:
Input: nums = [1,3,4,2,2]
Output: 2
Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
Example 3:
Input: nums = [1,1]
Output: 1
 */
public class findDuplicateNum {
	public static void main(String[] args) {
		int nums[] = {3,1,3,4,2};
		System.out.println(getDuplicate(nums));
	}

	private static int getDuplicate(int[] nums) {
		int slow = nums[nums[0]];
		int fast = nums[nums[nums[0]]];
		while(slow!=fast) {
			slow = nums[slow];
			fast = nums[nums[fast]];
		}
		slow = nums[0];
		while(slow!=fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}
}
