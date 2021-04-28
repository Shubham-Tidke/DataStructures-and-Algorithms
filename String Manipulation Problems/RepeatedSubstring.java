import java.util.Scanner;

/* Problem Statement -
Given a string s, check if it can be constructed by taking a substring of it and 
appending multiple copies of the substring together.

Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Example 2:
Input: s = "aba"
Output: false

Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 */
public class RepeatedSubstring {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = sc.nextLine();
		RepeatedSubstring obj = new RepeatedSubstring();
		boolean result = obj.repeatedSubstringPattern(str);
		System.out.println(result);
	}
	private boolean repeatedSubstringPattern(String str) {
		 int l = str.length();
		    for(int i=l/2;i>=1;i--) {
		        if(l%i==0) {
		            int m = l/i;
		            String sub= str.substring(0,i);
		            StringBuilder sb = new StringBuilder();
		            for(int j=0;j<m;j++) {
		                sb.append(sub);
		            }
		            if(sb.toString().equals(str))
		            	return true;
		        }
		    }
		    return false;
	}

}
