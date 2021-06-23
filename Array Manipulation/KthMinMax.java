import java.util.Arrays;

/*
Given an array and a number k where k is smaller than the size of the array, 
we need to find the k’th smallest element in the given array. It is given that all array elements are distinct.
https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
Examples:  
    Input: arr[] = {7, 10, 4, 3, 20, 15} 
    k = 3 
    Output: 7
    Input: arr[] = {7, 10, 4, 3, 20, 15} 
    k = 4 
    Output: 10 
 */
public class KthMinMax {
	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		System.out.println(getKthMax(arr,0,arr.length,k));
	}
	private static int getKthMax(int[] arr, int l, int r, int k) {
		Arrays.parallelSort(arr);
		return arr[k-1];
	}
}
