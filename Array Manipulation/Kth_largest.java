import java.util.PriorityQueue;
/*
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Example 1:
Input: nums = [3,2,1,5,6,4], k = 2/ 1 2 3 4 5 6 
Output: 5
Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */
public class Kth_largest {
	public static void main(String[] args) {
		int arr[] = {3,2,1,5,6,4};
		int k = 2;
		/* using sort
		 * Arrays.sort(arr);
		 * System.out.println(arr[arr.length-k]);
		 */
		System.out.println(getKthLargest(arr,k));
	}
	private static Integer getKthLargest(int[] arr, int k) {
		PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int temp = arr.length-k;
		while(temp-->0) {
			pq.poll();
		}
		return pq.peek();
	}
}