import java.util.Arrays;
import java.util.Stack;
/*
Given a string s, remove duplicate letters so that every letter appears once and only once. 
You must make sure your result is the smallest in lexicographical order among all possible results.
Example 1:
Input: s = "bcabc"
Output: "abc"
Example 2:
Input: s = "cbacdcbc"
Output: "acdb"
 */
public class removeDupLetters {
	public static void main(String[] args) {
		String s = "cbacdcbc";
		System.out.println(removeDuplicate(s));
	}
	private static String removeDuplicate(String s) {
		Stack<Character>stack = new Stack<Character>();
		int[]arr = new int[26];
		boolean[] booleanArray=new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			arr[(int)s.charAt(i)-97] = i;
		}
		for (int i = 0; i < s.length(); i++) {
			if(!booleanArray[((int) s.charAt(i)) -97] )
	          {
	             while(!stack.isEmpty() && arr[(int)stack.peek()-97] >i && (int)stack.peek() > (int)s.charAt(i) )
	             {
	                  booleanArray[((int)stack.peek()) -97]=false;
	                  stack.pop();
	              }
	               stack.push(s.charAt(i));
	             booleanArray[((int) s.charAt(i)) -97]=true;
		}
	}
		StringBuilder sb = new StringBuilder();

		while(!stack.isEmpty()){
		    sb.insert(0,stack.pop());
		}
		return sb.toString();

	}
}
