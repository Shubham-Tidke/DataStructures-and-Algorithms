/*Problem -
Equilibrium index of an array is an index such that the sum of elements 
at lower indexes is equal to the sum of elements at higher indexes. 
For example, in an array A: 
1.
Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
Output: 3 
3 is an equilibrium index, because: 
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
2.
Input: A[] = {1, 2, 3} 
Output: -1 
 * 
 * 
 */
import java.util.Scanner;
public class EquillibriumPoint {
	public static void main(String[] args) {
		int arr[] = {-7, 1, 5, 2, -4, 3, 0} ;
		System.out.println(getEquillibriumIndex(arr));
	}
	private static int getEquillibriumIndex(int[] arr) {	
		int sum  = 0;
		int tempSum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		for (int i = 0; i < arr.length; tempSum += arr[i++]) {
            if (tempSum * 2 == sum - arr[i]) 
            	return i;
            }
		return -1;
	}
}