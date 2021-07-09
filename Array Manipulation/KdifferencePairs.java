import java.util.HashSet;
import java.util.Set;

/*
 * Given an unsorted array and a number n, find if there exists a pair of elements in the array whose difference is n. 
 * Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78
 * Output: Pair Found: (2, 80)
 * Input: arr[] = {90, 70, 20, 80, 50}, n = 45
 * Output: No Such Pair
 */
public class KdifferencePairs {
	public static void main(String[] args) {
		int arr[] = {90, 70, 20, 80, 50};
		int n =60;
		System.out.println(getPair(arr,n));
	}
	private static boolean getPair(int[] arr, int n) {
		Set<Integer>set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(Math.abs(n-arr[i]))) {
				System.out.println(Math.abs(n-arr[i])+","+arr[i]);
				return true;
			}
				set.add(arr[i]);		
		}
		return false;
	}
}