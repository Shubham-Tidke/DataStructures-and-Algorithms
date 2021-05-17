/*
 * Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
Example 1:
Input: x = 4
Output: 2
Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned
 */
public class sqrtX {

	public static void main(String[] args) {
		int x = 8;
		System.out.println(findSqrt(x));
	}
	private static int findSqrt(int x) {
		int first = 0,last = x;
		int solution = 0;
		while(first<=last) {
			int mid = (first+last) /2;
			if(mid*mid == x)
				return mid;
			else if(mid*mid < x) {
				solution =mid;
				first = mid+1;
			}
			else {
				last  = mid-1;
			}
		}
		return solution;
	}
}