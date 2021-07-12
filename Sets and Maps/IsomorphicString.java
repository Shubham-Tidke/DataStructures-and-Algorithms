import java.util.HashMap;
import java.util.Map;

/*
Problem Statement -
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.
Example 1:
Input: s = "egg", t = "add"
Output: true
Example 2:
Input: s = "foo", t = "bar"
Output: false
 */
public class IsomorphicString {

	public static void main(String[] args) {
		String one = "foo";
		String two = "bar";
		System.out.println(isomorphic(one,two));
	}

	private static boolean isomorphic(String one, String two) {
		if(one == null || two == null)return false;
		if(one.length()!=two.length())return false;
		Map<Character, Integer>mapOne = new HashMap<Character, Integer>();
		Map<Character, Integer>mapTwo = new  HashMap<Character, Integer>();
		for (int i = 0; i < one.length(); i++) {
			int temp1 = mapOne.getOrDefault(one.charAt(i), -1);
			int temp2 = mapTwo.getOrDefault(two.charAt(i), -1);
			if(temp1!=temp2)
				return false;
			mapOne.put(one.charAt(i), i);
			mapTwo.put(two.charAt(i), i);
		}
		return true;
	}

}
