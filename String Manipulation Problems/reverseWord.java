import java.util.Arrays;
import java.util.Collections;

/*
Reverse the words in a sentence
Example: Let the input string be “i like this program very much”. 
The function should change the string to “much very program this like i”

Input: s = “geeks quiz practice code” 
Output: s = “code practice quiz geeks”
 */
public class reverseWord {
	public static void main(String[] args) {
		String s = "geeks quiz practice code";
		System.out.println(reverseOnlyWords(s));
	}
	private static String reverseOnlyWords(String s) {
		String str[] = s.split(" ");
		Collections.reverse(Arrays.asList(str));
		return String.join(" ", str);
	}
}