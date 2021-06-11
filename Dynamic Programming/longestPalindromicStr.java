public class longestPalindromicStr {
	public static void main(String[] args) {
		String s ="babad";
		System.out.println(longestPalindrome(s));
	}
	private static String longestPalindrome(String s) {
		String longestPalinSubStr = null;
		boolean dp[][] = new boolean[s.length()][s.length()];
		for (int i = s.length()-1; i >=0; i--) {
			for (int j = i; j < s.length(); j++) {
	//if substring length == 1, dp[i][j] = true, if substring length == 2 ,check if first and last char are same
				dp[i][j]=(s.charAt(i)==s.charAt(j) && (j-i<3||dp[i+1][j-1]));
				//check if the substring found is longer than earlier found substring,replace
				if(dp[i][j] && (longestPalinSubStr == null||j-i+1 > longestPalinSubStr.length())) {
					longestPalinSubStr = s.substring(i,j+1);
				}
			}
		}
		return longestPalinSubStr;
	}
}