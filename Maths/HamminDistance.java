/*
 * he Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, return the Hamming distance between them.
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       |   |
The above arrows point to positions where the corresponding bits are different.
 */
public class HamminDistance {

	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		System.out.println(getHammingDistance(x,y));
	}
	private static int getHammingDistance(int x, int y) {
	return	Integer.bitCount(x ^ y);
	}

}
