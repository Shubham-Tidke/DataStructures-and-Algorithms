import java.util.HashSet;
/*
Given a dictionary of words and a pattern. 
Every character in the pattern is uniquely mapped to a character in the dictionary.
 Find all such words in the dictionary that match the given pattern.

Example 1:
Input:
N = 4
dict[] = {abb,abc,xyz,xyy}
pattern  = foo
Output: abb xyy
Explanation: xyy and abb have the same
character at index 1 and 2 like the
pattern.
 */
public class matchSpecificPattern {
	public static void main(String[] args) {
		int n = 4;
	String[]dict = {"abb","abc","xyz","xyy"};
	String pattern = "foo";
	matchPattern(dict,pattern);
	}
	private static void matchPattern(String[] dict, String pattern) {
			HashSet<String>set = new HashSet<String>();
			for (int i = 0; i < dict.length; i++) {
				set.add(dict[i]);
			}
			for (String str : dict) {
				if(match(pattern,str))
					System.out.print(str+" ");
			}		
		}
	private static boolean match(String pattern, String str) {
		if(pattern.length()!=str.length())
			return false;
		int[]arr = new int[128];
		for (int i = 0; i < str.length(); i++) {
		if(arr[(int)pattern.charAt(i)] == 0) {
			arr[(int)pattern.charAt(i)] = str.charAt(i);
		}
		else if(arr[(int)pattern.charAt(i)] != str.charAt(i))
		{
			return false;
		}
	}
		return true;
	}
}