/*
roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. 
The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */
public class romanToInteger {

	public static void main(String[] args) {
		String str = "MCMIV";
		System.out.println(toDecimal(str));
	}
	private static String toDecimal(String str) {
		int decimal = 0;
		int lastNum = 0;
		str = str.toUpperCase();
		for (int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'M': 
				decimal = getDecimal(1000,lastNum,decimal);
				lastNum = 1000;
				break;
			case 'D':
				decimal = getDecimal(500, lastNum, decimal);
				lastNum = 500;
				break;
			case 'C':
				decimal = getDecimal(100, lastNum, decimal);
				lastNum = 100;
				break;
			case 'L':
				decimal = getDecimal(50, lastNum, decimal);
				lastNum = 50;
				break;
			case 'X':
				decimal = getDecimal(10, lastNum, decimal);
				lastNum = 10;
				break;
			case 'V':
				decimal = getDecimal(5, lastNum, decimal);
				lastNum = 5;
				break;
			case 'I':
				decimal = getDecimal(1, lastNum, decimal);
				lastNum = 1;
				break;	
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}
		return Integer.toString(decimal);
	}
	private static int getDecimal(int i, int lastNum, int lastdecimal) {
		if(lastNum > i) 
			return lastdecimal - i;
		return lastdecimal + i;
	}
}