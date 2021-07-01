import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given an array of n elements that contains elements from 0 to n-1, 
 * with any of these numbers appearing any number of times. 
 * Find these repeating numbers in O(n) and using only constant memory space
 * Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
 * Output: 1, 3, 6
 */
public class findDuplicates {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 6, 3, 6, 1};
		System.out.println( Arrays.toString( InremoveDuplicates(arr)));
	}
	private static Object[] InremoveDuplicates(int[] arr) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arr[arr[i]%arr.length] += arr.length;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 2*arr.length)
				list.add(i);
		}
		return list.toArray();
	}
}