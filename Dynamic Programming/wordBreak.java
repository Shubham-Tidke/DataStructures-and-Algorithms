/*
Given a string s and a dictionary of strings wordDict,
return true if s can be segmented into a space-separated sequence of one or more dictionary words.
Note that the same word in the dictionary may be reused multiple times in the segmentation.
Example 1:
Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:
Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
Example 3:
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false
 */
import java.util.HashSet;
import java.util.Set;

public class wordBreak {
	public static void main(String[] args) {
		String s = "leetcode";
		String[]wordDict = {"cats","dog","sand","and","cat"};
		System.out.println(getWord(s,wordDict));
	}
	private static boolean getWord(String s, String[] wordDict) {
		boolean[] dp = new boolean[s.length()+1];//9
		Set<String>set = new HashSet<String>();
		for (String str : wordDict) {
			set.add(str);
		}
		dp[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = i-1; j >= 0; j--) {
				dp[i] = dp[j] && set.contains(s.substring(j,i));
				if(dp[i])break;
			}
		}
		return dp[s.length()];
	}
}