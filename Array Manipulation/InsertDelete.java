/*Problem -
Take a SORTED array and write functions to perform insert and delete operations keeping the array sorted.
Note - Use predefined java search function if you need to search for the index in your code.
Please take all the inputs from the user.
Please cover corner cases if any
Write functions - 
a. insert(int[] arr, int valueToBeInserted)
Description - return -1 if capacity of array is full
b. delete(int[] arr, int valueToBeDeleted)
Description - return -1 if element not present
*/
import java.util.Arrays;
import java.util.Scanner;
public class InsertDelete {
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5};
		int size = 5;
		int value = 2;
		int capacity = arr.length;
		size =delete(arr,size,value,capacity);
		System.out.println(Arrays.toString(arr));
		size = insert(arr,size,value,capacity);
		System.out.println(Arrays.toString(arr));
	}
	private static int insert(int[] arr, int n, int value, int capacity) {
		if(n>=capacity) System.out.println("Already full");
		for (int i = 0; i< arr.length; i++) {
			if(arr[i]==-1)
				arr[i]=value;
		}
		Arrays.parallelSort(arr);
		return n+1;
	}
	private static int delete(int[] arr, int n, int value, int capacity) {
		int index = binarysearch(arr,0,n-1,value);
		if(index == -1)System.out.println("element not found!");
		else {
			for (int i = index; i < n-1; i++) {
				arr[i] = arr[i+1];
			}
			arr[n-1] =-1;
		}
		return n-1;
	}
	private static int binarysearch(int[] arr, int low, int high, int value) {
		if(low>high)return -1;
		int mid = (high+low)/2;
		if(value == arr[mid])return mid;
		else if(value>arr[mid])
			return binarysearch(arr, mid+1, high, value);
		return binarysearch(arr, low, mid-1, value);
	}
}