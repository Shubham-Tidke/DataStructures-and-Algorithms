/*
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11" [prev string has num 1 once hence, 1(count)1(number)]
countAndSay(3) = say "11" = two 1's = "21" [prev string has num 1 twice hence,2(count)1(number)]
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 */
public class lookAndSay {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(getlookAndSay(n));
	}
	private static String getlookAndSay(int n) {
		if(n == 1)return "1";
		if(n == 2)return "11";
		if(n == 3)return "21";
		String result = getlookAndSay(n-1);
		StringBuffer newResult = new StringBuffer();
		int count = 1;
		for (int i = 1; i < result.length(); i++) {
			if(result.charAt(i)!=result.charAt(i-1)) {
				newResult.append(count);
				newResult.append(result.charAt(i-1));
				count = 1;
			}
			else
				count++;
			if(i == result.length()-1) {
				newResult.append(count);
				newResult.append(result.charAt(i));
			}		
		}
		return newResult.toString();
	}
}