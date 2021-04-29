import java.util.Stack;

/*
 Problem -
Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.

Formally, a parentheses string is valid if and only if:

It is the empty string, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.

Sample Input
( ) ) ) ( (
stack 1 -> push (,
when ),pop st1,if st1 empty count++

Sample Output
4
 */
public class MinValidateParanthesis {

	public static void main(String[] args) {
		String Input = "()))((";
		MinValidateParanthesis obj = new MinValidateParanthesis();
		obj.checkCount(Input);
	}
	private void checkCount(String input) {
		Stack st1 = new Stack();
		
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(')
				st1.push(input.charAt(i));
			else
				if(!st1.isEmpty()) 
				{
					st1.pop();
				}
				else
					count++;
		}
		System.out.println(st1.size()+count); 
		
	}

}
