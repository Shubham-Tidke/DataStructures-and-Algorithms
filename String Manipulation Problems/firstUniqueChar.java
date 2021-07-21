/*
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * 
 * Input: s = "leetcode"
 * Output: 0
 * Input: s = "aabb"
 * Output: -1
 */
public class firstUniqueChar {

	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(getFirstUniq(s));
	}

	private static int getFirstUniq(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(s.lastIndexOf(s.charAt(i))== s.indexOf(s.charAt(i)))
				return i;
		}
		return -1;
	}

}
