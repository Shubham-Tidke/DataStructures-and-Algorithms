/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[]arr = {"dog","racecar","car"};
		System.out.println("'"+commonPre(arr)+"'");
	}
	private static String commonPre(String[] arr) {	
		int min = arr[0].length();
		for (int i = 1; i < arr.length; i++) { //FINDING SMALLEST STRING IN ARRAY
			if(arr[i].length()<min)
				min = arr[i].length();
		}
		String solution = "";
		char prefix;
		for (int i = 0; i < min; i++) {
			prefix = arr[0].charAt(i);	//CHECKING OTHER STRINGS WITH SMALLEST STRING
			for (int j = 1; j < arr.length; j++) {
				if(arr[j].charAt(i)!=prefix)
					return solution;
			}
			solution+=prefix;		
		}
		return solution;
	}
}