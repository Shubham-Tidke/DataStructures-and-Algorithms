import java.util.Scanner;

/*
Problem Statement -

Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
A subarray is defined as a contiguous sequence of numbers in an array.

Example 1:
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.

Example 2:
Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.

Example 3:
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
 */
public class MaxAscendingSubArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int maxSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			while(i+1 < arr.length && arr[i] < arr[i+1])
			{
				temp+=arr[i+1];
				i++;
			}
			if(temp>maxSum)
			{
				maxSum = temp;
				
			}
		}
		System.out.println(maxSum);

	}

}
