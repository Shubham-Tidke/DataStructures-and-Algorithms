/*
 * You are given two strings order and s. All the words of order are unique and were sorted in some custom order previously
 * Permute the characters of s so that they match the order that order was sorted. More specifically,
 * if a character x occurs before a character y in order, then x should occur before y in the permuted string.
 * Return any permutation of s that satisfies this property.
Input: order = "cba", s = "abcd"
Output: "cbad"
Explanation: 
"a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a". 
Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.
 */
public class customSortString {

	public static void main(String[] args) {
		String order = "cbafg";
		String s = "abcde";
		System.out.println(getCustomSort(order,s));
	}
	private static String getCustomSort(String order, String s) {
		int []frequency = new int[26];
		//storing frequnecy of characters in string
		for(char ch : s.toCharArray())
			frequency[ch-'a']++;
		StringBuilder solution = new StringBuilder();
		
		//adding charcters of order in solution which has frequency > 0
		for(char ch : order.toCharArray()) {
			while(frequency[ch-'a']>0) {
				solution.append(ch);
				frequency[ch-'a']--;
			}
		}
		//adding characters which are not in order string but in input string
		for (int i = 0; i < frequency.length; i++) {
			while(frequency[i]-->0)
			solution.append((char)(i+'a'));
		}
		return solution.toString();
	
	}
}

