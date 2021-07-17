import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an integer array nums and an integer k, return true if nums has a continuous subarray of size 
 * at least two whose elements sum up to a multiple of k, or false otherwise.
 * An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 * 
 * Input: nums = [23,2,4,6,7], k = 6 Output: true
 * Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
 * Input: nums = [23,2,6,4,7], k = 13 Output: false
 */
public class ContiSubArrSum {

	public static void main(String[] args) {
		int arr[] = {23,2,4,6,7};
		int  k = 6;
		System.out.println(isContinuousSum(arr,k));
	}
	private static boolean isContinuousSum(int[] arr, int k) {
		Map<Integer, Integer>map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			leftSum +=arr[i];
			if(k!=0)
				leftSum = leftSum%k;
			Integer temp = map.get(leftSum);
			if(temp!=null) {
				if(i-temp > 1)return true;
			}
			else
				map.put(leftSum, i);
		}
		
		return false;
	}
}