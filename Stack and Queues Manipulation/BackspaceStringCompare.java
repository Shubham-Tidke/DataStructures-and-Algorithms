import java.util.*;

/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.
Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:
Input: s = "a##c", t = "#a#c"
Output: true
Explanation: Both s and t become "c".
Example 4:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

 */
public class BackspaceStringCompare {
	
	public static void main(String[] args) {
		String s ="ab##";
		String t ="c#d#";
		System.out.println(checkBackspace(s,t));
	}
	private static boolean checkBackspace(String s, String t) {
		return helper(s).equals(helper(t));
	}
	private static Stack<Character> helper(String str) {
		Stack<Character>stack = new Stack<Character>();
		for(char ch : str.toCharArray()){
			if(ch!='#')
				stack.push(ch);
			else if(!stack.isEmpty())
				stack.pop();
		}
		return stack;
	}
}
