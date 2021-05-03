import java.util.HashMap;
/*
 We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.
Example 1:
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].
Example 2:
Input: nums = [1,2,3,4]
Output: 2
Example 3:
Input: nums = [1,1,1,1]
Output: 0
 */
public class longestHarmonium {
	public static void main(String[] args) {
		int[]arr = {1,2,3,4};
		System.out.println(harmonium(arr));
	}
	private static int harmonium(int[] arr) {
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		int max = 0;
		int[]solution= {1,-1};
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) 
				map.put(arr[i], map.get(arr[i])+1);
			else 		
				map.put(arr[i], 1);	
			for (Integer val : solution) {
                if (map.containsKey(arr[i] + val))
                	max = Math.max(max, map.get(arr[i]) + map.get(val + arr[i]));
            }	
		}
		return max;			
	}
}