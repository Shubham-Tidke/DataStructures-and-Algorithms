/*Given a string s containing just the characters 
 * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 
An input string is valid if:
	1. Open brackets must be closed by the same type of brackets.
	2. Open brackets must be closed in the correct order.

Input: s = "()[]{}"
Output: true

Input: s = "([)]"
Output: false

Input: s = "{[]}"
Output: true
 
 */
import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Paranthesis String : ");
	String str = sc.nextLine();
	if(str.length()<2)
	{
		System.out.println("false");
	}
	else {
		ValidParanthesis check = new ValidParanthesis();
		boolean result  = check.CheckValid(str);
		if(result == true)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}	
}
	
	
	private boolean CheckValid(String str) {
		Stack st = new Stack();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c =='{' || c == '[' || c == '(')
			{
				st.push(c);
				count++;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			char ch = (char)st.peek();
			if( c == '}')
			{
				if(ch == '{')
				{
					count--;
					st.pop();
				}
			}
			if( c == ']')
			{
				if(ch == '[')
				{
					count--;
					st.pop();
				}
			}
			if( c == ')')
			{
				if(ch == '(')
				{
					count--;
					st.pop();
				}
			}
			
		}
		if(count == 0)
			return true;
		
		
		return false;
	}

}
