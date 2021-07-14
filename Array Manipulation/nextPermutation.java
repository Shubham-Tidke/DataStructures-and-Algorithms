import java.util.Arrays;
/*
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
 * The replacement must be in place and use only constant extra memory.
 
 	Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]

	Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]

 */
public class nextPermutation {
	public static void main(String[] args) {
		int arr[] = {2,3,1};
		getNextPermutation(arr);
	}
	private static void getNextPermutation(int[] arr) {
		//find smallest from right to left
		int i = 0;
		for ( i = arr.length-1; i > 0; i--) {
			if(arr[i] > arr[i-1])
				break;
		}
		// if smallest is already at end [decreasing order of array,reverse the array]
		if(i==0) {
			reverse(arr);
		}
		//else,find the next greater from current found greater value index and swap 
		else {
			int min = i;
			int temp = arr[i-1];
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] > temp && arr[j] < arr[min]) {
					min = j;
				}
			}
			int swap = arr[i-1];
			arr[i-1] = arr[min];
			arr[min] = swap;
			Arrays.sort(arr,i,arr.length);
			System.out.println(Arrays.toString(arr));
		}
	}
	private static void reverse(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}