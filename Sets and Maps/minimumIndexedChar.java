import java.util.HashMap;
/*
Given a string str and another string patt Find the character in patt that is present at the minimum index in str.
Expected Time Complexity: O(max(|str|, |patt|))
Expected Auxilary Space: O(K) where K <= 26
Constraints:
1 ≤ |str|, |patt| ≤ 104

Example 1:
Input: str = "zsyle", patt = "bjz"
Output: "z"

Example 2:
Input: str = "anskg", patt = "me"
Output: "$"
 */
public class minimumIndexedChar {
	public static void main(String[] args) {
		String str = "gfitdvbpsy";
		String patt = "qfbtrlodkm";
		minimumIndexedChar obj = new minimumIndexedChar();
		System.out.println(obj.minimumIndex(str,patt));
	}
	private char minimumIndex(String str, String patt) {
		HashSet<Character>set = new HashSet<Character>();
		for (int i = 0; i < patt.length(); i++) {
			set.add(patt.charAt(i));
		}
		for (int i = 0; i < str.length(); i++) {
			if(set.contains(str.charAt(i)))
				return str.charAt(i);
		}
		return '$';
	}
}