/*
Given an array of integers where each element represents the max number of steps that can be made forward from that element. 
Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). 
If an element is 0, they cannot move through that element. If the end isn’t reachable, return -1.

https://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/
Examples: 
Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3 (1-> 3 -> 8 -> 9)
Explanation: Jump from 1st element 
to 2nd element as there is only 1 step, 
now there are three options 5, 8 or 9. 
If 8 or 9 is chosen then the end node 9 
can be reached. So 3 jumps are made.
Input:  arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
Output: 10
Explanation: In every step a jump 
is needed so the count of jumps is 10.

The first element is 1, so can only go to 3. The second element is 3, so can make at most 3 steps eg to 5 or 8 or 9.
 */
public class minJumpsToReachEnd {
	public static void main(String[] args) {
		int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		System.out.println(getMinimumJumps(arr,0,arr.length-1));
	}
	private static int getMinimumJumps(int[] arr, int start, int end) {
		
		if(start == end)
			return 0;
		if(arr[start] == 0)
			return Integer.MAX_VALUE;
		int steps = Integer.MAX_VALUE;
		for (int i = start+1; i <= end && i<= start+arr[start]; i++) {
			int jumps = getMinimumJumps(arr, i, end);
			 if(jumps!=Integer.MAX_VALUE && jumps+1 < steps) 
				steps =jumps+1;
		}
		return steps;
	}
}