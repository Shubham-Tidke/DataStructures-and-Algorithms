import java.util.*;

import javax.sound.midi.Soundbank;
/*
 * Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing order.
Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */
public class sqrOfSortedArr {
	public static void main(String[] args) {
		int nums[] = {-7,-3,2,3,11};
		System.out.println(Arrays.toString(sortedSquares(nums)));	
	}
	private static int[] sortedSquares(int[] nums) {
		int pos_pointer = 0;int neg_pointer = 0;
		int solution[] = new int[nums.length];
		int solution_counter = 0;
		while(nums[pos_pointer]<0 &&  pos_pointer<nums.length) {
			pos_pointer++;
		}
		neg_pointer = pos_pointer-1;//negative pointer at biggest negative element
		while(neg_pointer>=0 && pos_pointer < nums.length) {
			if(nums[neg_pointer]*nums[neg_pointer] < nums[pos_pointer]*nums[pos_pointer]) {
				solution[solution_counter] = nums[neg_pointer]*nums[neg_pointer];
				neg_pointer--;
			}
			else {
				solution[solution_counter] = nums[pos_pointer]*nums[pos_pointer];
				pos_pointer++;
			}
			solution_counter++;
		}
		while(neg_pointer>=0) {
			solution[solution_counter] = nums[neg_pointer]*nums[neg_pointer];
			neg_pointer--;solution_counter++;
		}
		while(pos_pointer<nums.length) {
			solution[solution_counter] = nums[pos_pointer]*nums[pos_pointer];
			pos_pointer++;solution_counter++;
		}
		return solution;
	}

}
