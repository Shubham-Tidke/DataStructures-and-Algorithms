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
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		EquillibriumPoint e = new EquillibriumPoint();
		int value = e.findEquillibrium(arr);
		System.out.println(value);	
	}
	private int findEquillibrium(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int left = leftSum(arr,0,i);
			int right = rightSum(arr,i+1,arr.length);
			if (left == right) 
				return i;
		}
		return -1;	
	}
	private int leftSum(int[] arr, int x, int y) {
		int sum = 0;
		for (int i = x; i < y; i++) {
			sum += arr[i];		
		}
	//	System.out.println("LeftSum: "+sum);
		return sum;
	}
	private int rightSum(int[] arr, int x, int y) {
		int sum = 0;
		for (int i = x; i < y; i++) {
			sum += arr[i];
		}
	//	System.out.println("RightSum: " +sum);
		return sum;
	}
}