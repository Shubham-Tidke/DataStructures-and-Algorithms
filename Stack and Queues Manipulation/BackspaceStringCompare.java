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
		String str1 = "a#c";
		String str2 = "b";
		BackspaceStringCompare obj = new BackspaceStringCompare();
		obj.CheckString(str1,str2);
	}

	private void CheckString(String str1, String str2) {
		Stack st1 = new Stack();
		Stack st2 = new Stack();
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i)=='#' && !st1.empty()) {	
				st1.pop();
			}
			else
			{
				st1.push(str1.charAt(i));
			}
			for (int i1 = 0; i1 < str2.length(); i1++) {
				if(str2.charAt(i1)=='#' && !st2.empty()) {	
					st2.pop();
				}
				else
				{
					st2.push(str2.charAt(i1));
				}	
			}
								
		}
		if(st1.size() == st2.size())
		{
			int count = 0;
			for (int j = 0; j < st1.size(); j++)
			{
				if((st1.pop()).equals(st2.pop()))
					count++;
			}
			if(count == st1.size())
				System.out.println("true");
			else
				System.out.println("False");
		}
		else
			System.out.println("False");	
	}

}
