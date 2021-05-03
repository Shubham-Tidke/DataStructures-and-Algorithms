import java.util.Stack;
/*
Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place,
and all letters reverse their positions.
Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */
public class OnlyLetterReverse {
	public static void main(String[] args) {
	String str = "a-bC-dEf-ghIj";
	charReverse(str);
	}
	private static void charReverse(String str) {
		String ans ="";
		Stack<Character>st = new Stack<Character>();
		//ASCII logic if A to Z or a to z appears,push
		for (int i = 0; i < str.length(); i++) {
			if(( (int)str.charAt(i)>=97 && (int)str.charAt(i)<=122 ) ||( (int)str.charAt(i)>=65 && (int)str.charAt(i)<=90)) {
				st.push(str.charAt(i));
			}
		}
		//if if A to Z or a to z appears,pop and add it to solution string else add from input string
		for (int i = 0; i < str.length(); i++) {
			if(( (int)str.charAt(i)>=97 && (int)str.charAt(i)<=122 ) ||( (int)str.charAt(i)>=65 && (int)str.charAt(i)<=90)) {
				ans+=st.pop();			
			}
			else
				ans+=str.charAt(i);
		}
		System.out.println(ans);
	}
}