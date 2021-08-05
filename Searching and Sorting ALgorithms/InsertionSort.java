import java.util.Arrays;
/*	O(n^2)
 * sorted array is built by using one element at a time 
 * The first step involves the comparison of the element in question with its adjacent element.
 */
//25, 17, 31, 13, 2
public class insertionSort {

	public static void main(String[] args) {
		int arr[] = {25, 17, 31, 13, 2};
		System.out.println(Arrays.toString(insertion(arr)));
	}
	private static int[] insertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
}