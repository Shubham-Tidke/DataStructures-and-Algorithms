import java.util.Stack;

/*
 * https://leetcode.com/problems/valid-parentheses/
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    
    Input: s = "()[]{}"
	Output: true
	Input: s = "(]"
	Output: false
 */
public class validParanthesis {

	public static void main(String[] args) {
		String s = "[";
		System.out.println(isValidParenthesis(s));
	}
	private static boolean isValidParenthesis(String s) {
		Stack<Character>stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(')
				stack.push(s.charAt(i));
			else {
				if(s.charAt(i)=='}')
				{
					if(stack.isEmpty() || stack.pop()!='{') return false;
				}
				if(s.charAt(i)==']')
				{
					if(stack.isEmpty() || stack.pop()!='[') return false;
				}
				if(s.charAt(i)==')')
				{
					if(stack.isEmpty() || stack.pop()!='(') return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
