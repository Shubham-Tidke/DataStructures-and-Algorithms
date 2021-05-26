import java.util.*;
/*
 * Given an array nums with n objects colored red, white, or blue, 
 * sort them in-place so that objects of the same color are adjacent,
 *  with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
Example 3:
Input: nums = [0]
Output: [0]
Example 4:
Input: nums = [1]
Output: [1]
 */
public class sortColors {
	public static void main(String[] args) {
		int nums[] = {2,0,2,1,1,0};
		sortColor(nums);
	}
	private static void sortColor(int[] nums) {
		int start = 0;int middle =0; int end = nums.length-1;
		while(middle<=end) {
			switch(nums[middle]) {
			case 0:
				swap(nums,start,middle);
				start++;middle++;
				break;
			case 1:
				middle++;
				break;
			case 2:
				swap(nums,middle,end);
				end--;
				break;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	private static void swap(int[] nums, int num1, int num2) {
		nums[num1]+=nums[num2];
		nums[num2] = nums[num1]-nums[num2];
		nums[num1] = nums[num1]-nums[num2];
	}
}
/*
 * PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
for (int i = 0; i < nums.length; i++) {
	pq.add(nums[i]);
}
for (int i = 0; i < nums.length; i++) {
	nums[i] = pq.poll();
}
System.out.println(Arrays.toString(nums));*/
/*
for (int i = 0; i < nums.length-1; i++) {
	for (int j = i+1; j < nums.length; j++) {
		if(nums[i]>nums[j]) {
			nums[i] +=nums[j];
			nums[j] =nums[i]-nums[j];
			nums[i] = nums[i]-nums[j];
			
		}
	}
}
System.out.println(Arrays.toString(nums));
*/
