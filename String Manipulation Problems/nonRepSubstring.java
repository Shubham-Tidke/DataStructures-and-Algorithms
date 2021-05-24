import java.util.HashSet;

/*
Input: s = "abcabcdbb"
Output: 4
Explanation: The answer is "abc", with the length of 3.
 */
public class nonRepSubstring {

	public static void main(String[] args) {
		String str = "abcabcdbefgb";
		System.out.println(longestSubstr(str));
	}
	private static int longestSubstr(String str) {
		HashSet<Character>set = new HashSet<Character>();
		int longestSubstr = 0;
		int i = 0;int j = 0;
		while(j<str.length()) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				longestSubstr = Math.max(set.size(), longestSubstr);
				j++;
			}
			else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return longestSubstr;
	}

}
