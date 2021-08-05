import java.util.Arrays;
//25, 17, 31, 13, 2
/*	O(n^2)
 *sorting in-place [sorted sub array - unsorted sub array]
 *-> Pick the minimum element from the unsorted subarray.
 *-> Swap it with the leftmost element of the unsorted subarray.
 *-> Now the leftmost element of unsorted subarray becomes a part (rightmost) of sorted subarray
 * and will not be a part of unsorted subarray
 */
public class selectionSort {
	public static void main(String[] args) {
		int arr[] = {25, 17, 31, 13, 2};
		System.out.println(Arrays.toString(selection(arr)));
	}
	private static int[] selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = getMin(arr,i);
			if(i!=minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
	private static int getMin(int[] arr, int i) {
		int min = i;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[j]<arr[min]) {
				min = j ;
			}
		}
		return min;
	}

}
