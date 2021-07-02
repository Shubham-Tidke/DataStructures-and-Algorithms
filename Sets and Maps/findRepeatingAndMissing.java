import java.util.HashSet;

/*
 * Given an unsorted array of size n. Array elements are in the range from 1 to n.
 * One number from set {1, 2, …n} is missing and one number occurs twice in the array.
 *  Find these two numbers
Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
Explanation: In the array, 
2 is missing and 3 occurs twice 

Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1
 */
public class findRepeatingAndMissing {
	public static void main(String[] args) {
		int arr[] = {2,21,17 ,16, 22, 3, 9, 10, 14, 12, 20, 11, 6, 4, 8, 7, 23, 15, 18, 13, 1, 10, 19};
		System.out.println(getMissingRepeating(arr));
	}
	//2,21,17 ,16, 22, 3, 9, 10, 14, 12, 20, 11, 6, 4, 8, 7, 23, 15, 18, 13, 1, 10, 19
	
	private static String getMissingRepeating(int[] arr) {
		int repeating =0;
		int missing = 0;
		HashSet<Integer>set = new HashSet<Integer>();
		for(int num:arr) {
			if(set.contains(num))
				repeating = num;
			else
				set.add(num);
		}
		for (int i = 0; i < arr.length; i++) {
			if(!set.contains(i+1))
				missing = i+1;
		}
		return "missing = "+missing+", repeating = "+repeating;
	}
}
