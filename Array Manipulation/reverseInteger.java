/*
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Input: x = 123 Output: 321
 */
public class reverseInteger {

	public static void main(String[] args) {
		int x = -123;
		System.out.println(getReverse(x));
	}
	private static int getReverse(int x) {
		 long answer = 0;
	        while(x != 0) {
	            answer = 10 * answer + x % 10;
	            x /= 10;
	        }
	        return (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) ? 0 : (int) answer;
	     }
}
