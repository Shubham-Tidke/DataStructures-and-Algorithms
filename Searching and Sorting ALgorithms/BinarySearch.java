//Problem - Take a sorted array and perform binary search.

import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);
	
	private int BinarySearch(int[] arr, int low, int high, int num) {
		
		if(high >= low) {
			int mid = low +(high-low)/2;
			
			if(arr[mid] == num) {
				return mid;
			}
			if(arr[mid] > num) 
			{
				return BinarySearch(arr, low, mid-1, num);
			}
			return BinarySearch(arr, mid+1, high, num);
		}
			
		return -1;		
	}
	
		public static void main(String[] args) {
			
			System.out.println("No. of elements in arr : ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("ENTER ELEMENTS [ASCENDING ORDER] : ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("No. to search in array : ");
			int num = sc.nextInt();
			int high = arr.length-1;
			int low = 0;
			BinarySearch B = new BinarySearch();
			int result = B.BinarySearch(arr,low,high, num);
			if (result != -1) {
				System.out.println("ELEMENT FOUND USING Binary SEARCH AT INDEX : "+result);
			}
			else System.out.println("ELEMENT NOT PRESENT IN GIVEN ARRAY");
		}
		
}
