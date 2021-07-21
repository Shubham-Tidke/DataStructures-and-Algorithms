import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2]
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [4,9] Explanation: [9,4] is also accepted.
 */
public class arrayIntersection_II {

	public static void main(String[] args) {
		int nums1 [] = {4,9,5};
		int nums2 [] = {9,4,9,8,4};
		System.out.println(Arrays.toString(getIntersection(nums1,nums2)));
	}
	private static int[] getIntersection(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		for (int i = 0; i < nums1.length; i++) {
			//adding first array to map [nums[1]-> key , count -> value]
			map.put(nums1[i],map.getOrDefault(nums1[i], 0)+1);
		}
		for (int i = 0; i < nums2.length; i++) {
			//if nums2[i] is in map with count > 0,add to list and reduce the count by 1 from map
			if(map.containsKey(nums2[i]) && map.get(nums2[i])> 0) {
				list.add(nums2[i]);
				map.put(nums2[i],map.getOrDefault(nums2[i], 0)-1);
			}
		}
		int arr[] = new int[list.size()];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = list.get(j);
		}
		return arr;
	}

}
