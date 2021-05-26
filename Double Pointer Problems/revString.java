import java.util.Arrays;
import java.util.Stack;

/*
 * Write a function that reverses a string. The input string is given as an array of characters s.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class revString {

	public static void main(String[] args) {
		String str = "Hannah";
		char[]arr = str.toCharArray();
		revArr(arr);
	}
	private static void revArr(char[] arr) {
		int temp1 = arr.length-1;
		for (int i = 0; i < arr.length/2; i++) {
			char ch = arr[i];
			arr[i] = arr[temp1];
			arr[temp1] = ch;
			temp1--;
		}/*
		int first = 0;
		int last = arr.length-1;
		while(first<last) {
			char temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}*/
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}