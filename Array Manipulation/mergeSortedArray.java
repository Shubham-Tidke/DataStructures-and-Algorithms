import java.util.Arrays;
/*
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * Can you come up with an algorithm that runs in O(m + n) time.
 * 
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * 
 */
public class mergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		System.out.println(Arrays.toString(mergeSortedArr(nums1,nums2)));
	}
	private static int[] mergeSortedArr(int[] nums1, int[] nums2) {
		int temp = nums1.length - nums2.length;
		int j = 0;
		for (int i = temp; i < nums1.length; i++) {
			nums1[i] = nums2[j++];
		}
		Arrays.sort(nums1);
		return nums1;
	}
}