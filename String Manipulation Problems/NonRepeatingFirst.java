/*
 * Given a string, find the first non-repeating character in it. 
For example, 
	if the input string is “GeeksforGeeks”, then the output should be ‘f’ 
	if the input string is “GeeksQuiz”, then the output should be ‘G’. 
 */
import java.util.Scanner;
public class NonRepeatingFirst {

	public static void main(String[] args) {
		String str = "aabb";
		System.out.println(getFirstNonRepeating(str));
	}
	private static char getFirstNonRepeating(String str) {
		int[]arr=new int[128];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		for (int j = 0; j < str.length(); j++) {
			if(arr[str.charAt(j)]==1) {
				return str.charAt(j);
			}
		}
		return ' ';
	}
