import java.util.ArrayList;
import java.util.List;

/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class findAllAnagrams {

	public static void main(String[] args) {
		String s ="cbaebabacd";
		String t = "abc";
		System.out.println(getAllAnagrams(s,t));
	}
	private static List<Integer> getAllAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<>();
	    if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;  
	    int[] hash = new int[256];
	    for (char c : p.toCharArray()) {
	        hash[c]++;
	    }
	    int left = 0, right = 0, count = p.length();
	    while (right < s.length()) {
	        if (hash[s.charAt(right)] >= 1) {
	            count--;
	        }
	        hash[s.charAt(right)]--;
	        right++;
	
	        if (count == 0) {
	            list.add(left);
	        }
	        if (right - left == p.length() ) {
	           if (hash[s.charAt(left)] >= 0) {
	                count++;
	            }
	            hash[s.charAt(left)]++;
	            left++;
	        
	        }
	      }
	        return list;
	    }
}