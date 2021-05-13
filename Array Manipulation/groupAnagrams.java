import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]
 */
public class groupAnagrams {

	public static void main(String[] args) {
	
		String[] strs = {"cat", "dog", "tac", "god", "act"};
		getAnagrams(strs);
	}
	private static void getAnagrams(String[] strs) {
		Map<String, List<String>>map = new HashMap<String, List<String>>(); //sorted word as key & list of anagrams as value
		for (int i = 0; i < strs.length; i++) {
			String word = strs[i];
			char[]chars = word.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			if(map.containsKey(key))
				map.get(key).add(word);
			else
			{
				List<String>words = new ArrayList<String>();
				words.add(word);
				map.put(key, words);
			}
		}
		for (String s:map.keySet()) {
			List<String>l = map.get(s);
			if(l.size()>1)
			{
				System.out.println(l);
			}
		}
	}

}
