/*
Given a string s, return the longest palindromic substring in s.
Example 1:
Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:
Input: s = "cbbd"
Output: "bb"
 */
public class subPalindrome {
	public static void main(String[] args) {	
		String s ="babad";
		System.out.println(longestPalindrome(s));
	}
	private static int longestPalindrome(String s) {
		int maxLength = 0, start = -1;
        for (int i = 0; i < s.length(); i++) {
            int length = Math.max(getLength(i, i, s), getLength(i, i + 1, s));

            if (maxLength < length) {
                maxLength = length;
                start = i - (length - 1) / 2;
            }
        }
        return s.substring(start, start + maxLength).length();
    }
    private static int getLength(int i, int j, String s) {
        if (j >= s.length()) return 0;
        int length = (i == j) ? -1 : 0;
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) != s.charAt(j)) break;
            length += 2;
            i--; j++;
        }
        return length;
	}
}