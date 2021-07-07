/*
 * Given a binary string str of length N, the task is to find the maximum count of consecutive substrings 
 * str can be divided into such that all the substrings are balanced i.e. they have equal number of 0s and 1s. 
 * If it is not possible to split str satisfying the conditions then print -1.
 * input: str = “0100110101” 
 * Output: 4 
 * The required substrings are “01”, “0011”, “01” and “01”.
 */
public class binaryStringSplit {
	public static void main(String[] args) {
		String str = "0111100010";
		System.out.println(getMaxCount(str));
	}
	private static int getMaxCount(String str) {
		int countZero = 0;
		int countOne = 0;
		int substrings = 0;
		int i = 0;
		while(i<str.length()) {
			if(str.charAt(i)=='0')
				countZero++;
			if(str.charAt(i)=='1')
				countOne++;
			if(countOne==countZero && countOne>0) 
				substrings++;
			i++;
		}
		return substrings > 0 ? substrings : -1;
	}
}