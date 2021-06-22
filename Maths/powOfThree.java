/*
An integer y is a power of three if there exists an integer x such that y == 3^x.
Input: n = 12
Output: true
Explanation: 12 = 3^1 + 3^2
 */
public class powOfThree {
	public static void main(String[] args) {
		int num = 14;
		System.out.println(isPowofThree(num));
	}
	private static boolean isPowofThree(int num) {
		while(num>0 && num%3 != 2)
			 num = (num%3 == 1)?(num-1):(num/3);
		return num==0;
	}
}