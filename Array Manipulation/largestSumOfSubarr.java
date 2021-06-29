/*
Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers
 that has the largest sum. 
https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
eg
{-2,-3,4,-1,-2,1,5,-3} = 7[4,-1,-2,1,5]
 */
public class largestSumOfSubarr {
	public static void main(String[] args) {
		int arr[] = {5,4,-1,7,8};
		System.out.println(largestSubarrSum(arr));
	}
	private static int largestSubarrSum(int[] arr) {
		//Kadane's algorithm
		int maxSum = Integer.MIN_VALUE;
		int tempSum = 0 ;
		for (int i = 0; i < arr.length; i++) {
			tempSum+=arr[i];
			maxSum=(maxSum<tempSum ? tempSum:maxSum);
			tempSum =(tempSum < 0 ? 0:tempSum);
		}
		return maxSum;
	}
}