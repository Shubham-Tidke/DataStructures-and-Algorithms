import java.util.*;
/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */

class anagram{
    public static void main(String[] args) {
		String strs[] = {"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(strs);
	}
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>map = new HashMap<String, List<String>>(); 
       //sorted ,word as key & list of anagrams as value
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
		return List.copyOf(map.values());
    }
}