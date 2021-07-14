/*
 * A peak element is an element that is strictly greater than its neighbors.Given an integer array nums, 
 * find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * You may imagine that nums[-1] = nums[n] = -infinite. You must write an algorithm that runs in O(log n) time.
 * Input: nums = [1,2,3,1] Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 */
public class peakElements {
	public static void main(String[] args) {
		int arr[] = {1,2,3,1};
		System.out.println(getPeak(arr));
	}
	private static int getPeak(int[] arr) {
		return helper(arr,0,arr.length-1);
	}
	private static int helper(int[] arr, int start, int end) {
		if(start == end) {
			return start;
		}else if(start+1 == end) {
			if(arr[start]>arr[end])
				return start;
			return end;
		}else {
			int mid = (start+end) /2;
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
				return mid;
			else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
				return helper(arr, mid+1, end);
			else
				return helper(arr, start, mid-1);
		}
	}
}