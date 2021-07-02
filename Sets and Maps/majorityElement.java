import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Write a function which takes an array and prints the majority element (if it exists),
 * otherwise prints “No Majority Element”.A majority element in an array A[] of size n
 *is an element that appears more than n/2 times (and hence there is at most one such element). 
 *
Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater
than the half of the size of the array size. 

Input : {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element
Explanation: There is no element whose frequency is
greater than the half of the size of the array size
 */
public class majorityElement {

	public static void main(String[] args) {
		int arr[] = {3, 3, 4, 2, 4, 4, 2};
		System.out.println(getMajorityElement(arr));
	}
	private static String  getMajorityElement(int[] arr) {
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry entry : map.entrySet()) {
			if((int)entry.getValue() > arr.length/2)
				return Integer.toString((int) entry.getKey());
		}
		return "No Majority Element";
	}
}