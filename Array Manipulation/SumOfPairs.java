import java.util.Scanner;

/*
 Problem Statement -
Write a program that, given an array A[] of n numbers and another number x, 
determines whether or not there exist two elements in S whose sum is exactly x. 
Examples -

Input: arr[] = {0, -1, 2, -3, 1}
        sum = -2
Output: -3, 1
If we calculate the sum of the output,
1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}
       sum = 0
Output: -1
No valid pair exists.
 */
public class SumOfPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ArraySize : ");
		int num = sc.nextInt();
		System.out.println("Array elements : ");
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Expected sum");
		int val = sc.nextInt();
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j] == val)
				{
					System.out.println((arr[i])+","+(arr[j]));
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0)
			System.out.println(-1);

	}

}
