import java.util.PriorityQueue;

/*
Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array.
All digits of given array must be used to form the two numbers.
Example 1:
Input:
N = 6
arr[] = {6, 8, 4, 5, 2, 3} 
Output:
604
Explanation: 
The minimum sum is formed by numbers 
358 and 246
 */
public class minSumFormed {
	public static void main(String[] args) {
		int arr[] = {5,5,7,3,8,2,2,0,6,9,5,4,7,9,7,6,1,4,2,9,7,8,1,1,1,7,5,7,8};
		System.out.println(getMinSum(arr));
	}
	private static Long getMinSum(int[] arr) {	
		String min1="";
		String min2="";
		PriorityQueue<String>pq = new PriorityQueue<String>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(Integer.toString(arr[i]));
		}
		if(pq.isEmpty())
			return (long) 0;
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0)
				min1+=pq.poll();
			else
				min2+=pq.poll();
		}
		return Long.parseLong(min1)+Long.parseLong(min2);
	}
}