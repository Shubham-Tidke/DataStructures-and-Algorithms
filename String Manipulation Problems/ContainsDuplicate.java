/*
Problems Statement -
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that -
1. nums[i] == nums[j] and 
2. abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
import java.util.*;
public class ContainsDuplicate {
	public static void main(String[] args) {
		int arr[] = {1,2,3,1,2,3};
		int k = 2;
		System.out.println(duplicate(arr,k)); 
	}
	private static boolean duplicate(int[] arr, int k) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int j = hashMap.get(arr[i]);
                System.out.println(i+" "+j);
                if (i - j <= k) {
                    return true;
                }
            }
            hashMap.put(arr[i], i);
        }
        return false;		
	}
}