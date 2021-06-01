import java.util.Scanner;

/* Problem Statement -
Given a string s, check if it can be constructed by taking a substring of it and 
appending multiple copies of the substring together.

Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Example 2:
Input: s = "aba"
Output: false

Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 */
public class RepeatedSubstring {
	
	public static void main(String[] args) {
		String str ="abab";
		System.out.println(isRepeated(str));
	}
	private static boolean isRepeated(String str) {
		String temp = str+str;
		return temp.substring(1, temp.length()-1).contains(str);
	}
}
