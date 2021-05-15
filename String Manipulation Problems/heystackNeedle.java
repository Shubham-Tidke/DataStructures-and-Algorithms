/*
 * Implement strStr() not using String functions.
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. 
Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. 
This is consistent to C's strstr() and Java's indexOf().
Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1
Example 3:
Input: haystack = "", needle = ""
Output: 0
 */
public class heystackNeedle {

	public static void main(String[] args) {
		String haystack = "hellohello";
		String needle = "ll";
		System.out.println(strstr(haystack,needle));
	}
	private static int strstr(String haystack, String needle) {
		if(needle.length() == 0 || haystack.length() == 0)
			return 0;
		char ch = needle.charAt(0);
		int len = needle.length();
		for (int i = 0; i < haystack.length() -len+1; i++) {
			char c = haystack.charAt(i);
					if(c==ch) {
						if(haystack.subSequence(i, i+len).equals(needle)) {
							return i;
						}
					}
		}
			return -1;
	}

}