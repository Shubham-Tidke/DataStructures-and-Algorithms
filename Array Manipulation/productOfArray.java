import java.util.Arrays;

/*
 * Given an integer array nums, return an array answer such that 
 * answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class productOfArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		System.out.println(Arrays.toString(getProduct(arr)));
	}
	private static int[] getProduct(int[] arr) {
		int solution[] = new int[arr.length];
		solution[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			solution[i] = arr[i-1]*solution[i-1];
		}
		int product = 1;
		for (int i = solution.length-1; i >=0 ;  i--) {
			solution[i] = solution[i]*product;
			product*=arr[i];
		}
		//System.out.println(Arrays.toString(solution));
		return solution;
	}
}