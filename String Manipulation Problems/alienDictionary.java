/*
 * In an alien language, surprisingly they also use english lowercase letters,
 *  but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
Given a sequence of words written in the alien language, and the order of the alphabet,
return true if and only if the given words are sorted lexicographicaly in this alien language.

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

 */
public class alienDictionary {
	static int arr[] = new int[26];
	public static void main(String[] args) {
		String[] words = {"hello","leetcode"};
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		System.out.println(isLexSorted(words,order));
	}
	private static boolean isLexSorted(String[] words, String order) {
		for (int i = 0; i < arr.length; i++) {
			arr[order.charAt(i)-'a'] = i; //mapping alien words to int 
		}
		for (int i = 0; i < words.length-1; i++) {
			if(compare(words[i], words[i+1], arr) > 0)return false;
		}
		return true;
	}
	private static int compare(String string1, String string2, int[] arr) {
		 int L1 = string1.length();
	        int L2 = string2.length();
	        int min = Math.min(L1,L2);
	        for (int i = 0; i < min; i++) {
	            int c1 = string1.charAt(i) - 'a';
	            int c2 = string2.charAt(i) - 'a';
	            if(c1 != c2)
	                return arr[c1] - arr[c2];
	        }
	        return L1 == min ? -1 : 1;
	}
}