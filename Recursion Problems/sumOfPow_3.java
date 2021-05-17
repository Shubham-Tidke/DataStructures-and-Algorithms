/*
 * Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three.
 * Otherwise, return false.
An integer y is a power of three if there exists an integer x such that y == 3^x.

Input: n = 12
Output: true
Explanation: 12 = 3^1 + 3^2

 */
public class sumOfPow_3 {

	public static void main(String[] args) {
		int num =12;
		System.out.println((isSumPow(num)));
	}
	private static boolean isSumPow(int num) {
		return helper(num,1);
	}
	private static boolean helper(int number, int pow) {
		if(number == 0)
			return true;
		if(pow > number)
			return false;
		return helper(number-pow,pow*3)|| helper(number,pow*3);
	}
}