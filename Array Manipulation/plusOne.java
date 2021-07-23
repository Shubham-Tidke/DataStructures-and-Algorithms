import java.util.Arrays;

/*
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contains a single digit.You may assume the integer does not contain any leading zero,
 * except the number 0 itself.
 * 
 * Input: digits = [4,3,2,1] Output: [4,3,2,2] Explanation: The array represents the integer 4321.
 */
public class plusOne {

	public static void main(String[] args) {
		int digits[]= {9};
		System.out.println(Arrays.toString(getPlusOne(digits)));
	}
	private static int[] getPlusOne(int[] digits) {
		int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }        
	        digits[i] = 0;
	    }
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    return newNumber;
	}
}