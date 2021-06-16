/*
Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
Return the number of nice sub-arrays.
Example 1:
Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
Example 2:
Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There is no odd numbers in the array.
Example 3:
Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16
 */
public class niceSubArrays {

	public static void main(String[] args) {
		int arr[] = {1,1,2,1,1};
		int k =3;
		System.out.println(getNiceSubCount(arr,k));
	}

	private static int getNiceSubCount(int[] nums, int k) {
		 int cur = 0, ans = 0;
	        int[] visited = new int[nums.length + 1];
	        visited[0] = 1;
	        for (int i = 0; i < nums.length; i++) {
	            cur += nums[i] % 2 == 1 ? 1 : 0;	
	            visited[cur] += 1;					
	            ans += cur >= k ? visited[cur - k] : 0; 
	        }
	        return ans;
	}

}
