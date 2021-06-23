/*
Given strings str1 and str2. The task is to find if str1 is a substring in the shuffled form of str2 or not.
Print “YES” if str1 is a substring in shuffled form of str2 else print “NO”. 
https://www.geeksforgeeks.org/check-if-the-given-string-is-shuffled-substring-of-another-string/
Example 

    Input: str1 = “onetwofour”, str2 = “hellofourtwooneworld” 
    Output: YES 
    Explanation: str1 is substring in shuffled form of str2 as 
    str2 = “hello” + “fourtwoone” + “world” 
    str2 = “hello” + str1 + “world”, where str1 = “fourtwoone” (shuffled form) 
    Hence, str1 is a substring of str2 in shuffled form.

    Input: str1 = “roseyellow”, str2 = “yellow” 
    Output: NO 
    Explanation: As the length of str1 is greater than str2. Hence, str1 is not a substring of str2.
 */
public class validShuffle {
	public static void main(String[] args) {
		String s1 = "onetwofour";
		String s2 = "hellofoutwooneworld";
		System.out.println(isValidShuffle(s1,s2));
	}
	private static boolean isValidShuffle(String s1, String s2) {
		if(s2.length()<s1.length())
			return false;
		int j = 0;
		for (int i = s1.length(); i < s2.length(); i++,j++) {
			if(isAnagram(s1,s2.substring(j,i)))
				return true;
		}
		return false;
	}
	private static boolean isAnagram(String str1, String str2) {
		int arr[] = new int[122];	
		for (int i = 0; i < str1.length(); i++) {
			arr[(int)str1.charAt(i)]++;
			arr[(int)str2.charAt(i)]--;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
			{
				return false;
			}
		}
		return true;
	}
} 