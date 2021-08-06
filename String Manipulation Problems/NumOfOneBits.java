//Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
/*
 * Input: n = 00000000000000000000000010000000
 * Output: 1
 * Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
 */
public class NumOfOneBits {
	public static void main(String[] args) {
		String n = "11111111111111111111111111111101";
		System.out.println(getOnes(n));
	}
	private static int getOnes(String n) {
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
			if(n.charAt(i) == '1')
				count++;
		}
		return count;
	}

}
