/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the rotation and an integer target,
return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

 
https://leetcode.com/problems/search-in-rotated-sorted-array/
Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
 */
public class rotatedArrSearch {

	public static void main(String[] args) {
		int nums[] = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(getRotatedSearch(nums,target));
	}

	private static int getRotatedSearch(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(nums[mid] == target)
				return mid;
			
			if(nums[start] <= nums[mid]) {
				if(target < nums[mid] && target >= nums[start])
					end = mid-1;
				else
					start = mid+1;
			}
			if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                 else
                    end = mid - 1;
            }
		}
		return -1;
	}
}