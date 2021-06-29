/*
Given a string, find the length of the longest repeating subsequence such that 
the two subsequences don’t have same string character at the same position, 
i.e., any i’th character in the two subsequences shouldn’t have the same index in the original string. 

https://www.geeksforgeeks.org/longest-repeating-subsequence/
Input: str = "abc"
Output: 0
There is no repeating subsequence

Input: str = "aab"
Output: 1
The two subssequence are 'a'(first) and 'a'(second). 
Note that 'b' cannot be considered as part of subsequence 
as it would be at same index in both.

Input: str = "aabb"
Output: 2

Input: str = "axxxy"
Output: 2
 */
public class longestRecurringSubsequence {
	public static void main(String[] args) {
		String str ="axxxy";
		System.out.println(getLongestSubsequence(str));
	}
	private static int getLongestSubsequence(String str) {
		 int n = str.length();	  
	     int[][] dp = new int[n+1][n+1];
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                // if characters match and indexes are not same
                if (str.charAt(i-1) == str.charAt(j-1) && i!=j)
                    dp[i][j] =  1 + dp[i-1][j-1];              
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
	        return dp[n][n];
	}
}