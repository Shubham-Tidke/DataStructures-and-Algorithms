/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than n / 2 times. 
You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class majorityElement {
	public static void main(String[] args) {
		int nums[] = {8,8,7,7,7};
		System.out.println(majorityCheck(nums));
	}
	private static int majorityCheck(int[] nums) {
		//Moore's algorithm
		int number = 0;	// index of majority element [considered 1st element as majority at start]
		int temp_count = 1;	//temp count for majorty element
		int real_count = 0;
		for (int i = 1; i < nums.length; i++) {
			//if element at index 'number' appears again,increas count
			//else decrease the count,if count gets to zero,replace element at index 'number'
			//with current element in loop
			if(nums[number] == nums[i])		
				temp_count++;
			else
				temp_count--;
			if(temp_count==0) {
				number = i;
				temp_count =1;
			}		
		}
		/* TO VERIFY THE IDENTIFIED NUMBER IS MAJORITY
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == nums[number])
				real_count++;
		}
		if(real_count >= nums.length/2)
		System.out.println(real_count);
		*/
		return nums[number];
	}

}
