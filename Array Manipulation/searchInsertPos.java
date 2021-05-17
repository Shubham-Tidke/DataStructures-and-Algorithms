/*
Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
*/
public class searchInsertPos {
	public static void main(String[] args) {
		int arr[] = {1,3,5,6};
		int target = 0;
		System.out.println(insertPos(arr,target));
	}
	private static int insertPos(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= target) {
				return i;
			}
		}
		return arr.length;
	}
}