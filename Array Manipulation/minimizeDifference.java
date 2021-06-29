import java.util.Arrays;

/*
Given heights of n towers and a value k. We need to either increase or decrease the height of every tower by k (only once) 
where k > 0. The task is to minimize the difference between the heights of the longest and 
the shortest tower after modifications and output this difference.

https://www.geeksforgeeks.org/minimize-the-maximum-difference-between-the-heights/
Examples: 

Input  : arr[] = {1, 15, 10}, k = 6 ->[4,6,9]
Output :  Maximum difference is 5.
Explanation : We change 1 to 7, 15 to 
9 and 10 to 4. Maximum difference is 5
(between 4 and 9). We can't get a lower
difference.

Input : arr[] = {1, 5, 15, 10} -> 4 8 12 7
        k = 3   
Output : Maximum difference is 8
arr[] = {4, 8, 12, 7}

Input : arr[] = {4, 6} 
        k = 10
Output : Maximum difference is 2
arr[] = {14, 16} OR {-6, -4}
 */
public class minimizeDifference {

	public static void main(String[] args) {
		int arr[] = {1, 10, 14, 14, 14, 15};
		int k = 6;
		System.out.println(getMaxDifference(arr,k));
	}
	private static int getMaxDifference(int[] arr, int k) {
		Arrays.sort(arr);
		int difference = arr[arr.length-1]-arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			int max = Math.max(arr[i]+k, arr[arr.length-1]-k);
			int min = Math.min(arr[i+1]-k,arr[0]+k);
			difference=Math.min(difference, max-min);
		}
		return difference;
	}
}
