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
import java.util.HashMap;
public class IsomorphicString {
	public static void main(String[] args) {
		String one = "paper";
		String two = "title";
		System.out.println(isomorphic(one,two));
	}
	private static boolean isomorphic(String one, String two) {
		if(one.length()!=two.length())
		return false;
		HashMap<Character,Character>map1 = new HashMap<Character,Character>();
		HashMap<Character,Character>map2 = new HashMap<Character,Character>();
		for (int i = 0; i <one.length(); i++) {
			char ch1 = one.charAt(i);
			char ch2 = two.charAt(i);
			if(map1.containsKey(ch1))//if first string char is key check for the char for second string on same
			{
				if(map1.get(ch1)!=ch2)
					return false;
			}
			if(map2.containsKey(ch2))
			{
				if(map2.get(ch2)!=ch1)	
				return false;
				map1.put(ch1, ch2);	
				map2.put(ch2, ch1);
			}
		}	
		return true;
	}
}