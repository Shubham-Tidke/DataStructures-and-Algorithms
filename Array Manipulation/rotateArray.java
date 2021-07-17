import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class rotateArray {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println(Arrays.toString(rotateByK(nums,k)));
	}

	private static int[] rotateByK(int[] nums, int k) {
		  Queue<Integer>q = new LinkedList<Integer>();
	        for(int i = 0 ; i<nums.length;i++){
	            q.add(nums[i]);
	        }
	        for(int i = 0;i< nums.length-k%nums.length  ; i++){
	            int temp = q.poll();
	            q.add(temp);
	        }
	        for(int i = 0 ; i<nums.length;i++){
	            nums[i] = q.poll();
	        }
		return nums;
	}
}
