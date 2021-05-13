/*Problem - Given integer array nums, return the third maximum number in this array. 
If the third maximum does not exist, return the maximum number.
Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation: The third maximum is 1.
Example 2:
Input: nums = [1,2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: nums = [2,2,3,1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
Note - take a small array upto 20 elements

Follow up: Can you find an O(n) solution?
 * 
 * 
 */
import java.util.Scanner;

public class ThirdMaximum {
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements to sort : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ThirdMaximum third = new ThirdMaximum();
		int value = third.FindMax(arr,n);
		System.out.println("Third Max Value : "+value);
		
	}
	private int FindMax(int[] arr, int n) {
		int first = arr[0];
		int second= Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			
			if(first < arr[i])
			{
				third = second;
				second = first;
				first = arr[i];	
			}
			else if (second < arr[i])
			{
				third = second;
				second = arr[i];
			}
			else if (third < arr[i]) 
			{
				third = arr[i];
			}
			if (second > arr[i] && second == first)
			{
				second = arr[i];
			}
			if (third > arr[i] && third == second)
			{
				third = arr[i];
			}
		}
		return third;
		
	}
	
}
