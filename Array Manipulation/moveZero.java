import java.util.Arrays;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
 */
public class moveZero {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		System.out.println(Arrays.toString(moveZeroToEnd(nums)));
	}
	private static int[] moveZeroToEnd(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				int pointer = i;
				while(nums[pointer]==0 && pointer < nums.length-1)
					pointer++;
				int temp = nums[i];
				nums[i]=nums[pointer];
				nums[pointer]=temp;
			}
		}
		return nums;
	}
}