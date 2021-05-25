import java.util.Arrays;
/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it.
In other words, arrange the elements into a sequence such that
 a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).
Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after 
sorting it in wave form are 
4 2 8 7 10 9.
 */
public class waveArray {
	public static void main(String[] args) {
		int arr[] = {2,4,7,8,9,10};
		System.out.println(Arrays.toString(getWaveArray(arr)));
	}
	private static int[] getWaveArray(int[] arr) {
		for (int i = 0; i < arr.length; i=i+2) {
			if(i>0 && arr[i-1]>arr[i]) {
				arr[i] = arr[i-1]+arr[i];
				arr[i-1] = arr[i]-arr[i-1];
				arr[i] = arr[i]-arr[i-1];
			}
			if(i<arr.length-1 && arr[i+1]>arr[i]) {
				arr[i] = arr[i+1]+arr[i];
				arr[i+1] = arr[i]-arr[i+1];
				arr[i] = arr[i]-arr[i+1];
			}
		}
		return arr;
	}
}