import java.util.HashSet;

/*
Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcdbb"
Output: 4
Explanation: The answer is "abc", with the length of 3.
 */
//set = abcd
public class nonRepeatingSubstring {
	public static void main(String[] args) {
		String s = "";
		System.out.println(longestSubstring(s));
	}
	private static int longestSubstring(String s) {
		//sliding window algorithm
		HashSet<Character>set = new HashSet<Character>();
		int max = Integer.MIN_VALUE;
		int first = 0;
		int last = 0;
		while(last<s.length()) {
			if(!set.contains(s.charAt(last))){
				set.add(s.charAt(last));
				max = Math.max(set.size(), max);
				last++;
			}
			else {
				set.remove(s.charAt(first));
				first++;
			}
		//	System.out.println(set);
		}
		if(max > 0)
		return max;
	return 0;
	}
}