import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given two sorted arrays, find their union and intersection.
https://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
Example:

Input : arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output : Union : {1, 2, 3, 4, 5, 6, 7} 
         Intersection : {3, 5}

Input : arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10} 
Output : Union : {2, 4, 5, 6, 8, 10} 
         Intersection : {6}
 */
public class unionIntersectionSortedArr {

	public static void main(String[] args) {
		int arr1[] = {1,3,4,5,7};
		int arr2[] = {2,3,5,6};
		System.out.println(Arrays.toString(getIntersection(arr1,arr2)));
		System.out.println(Arrays.toString(getUnion(arr1,arr2)));
	}
	private static Object[] getUnion(int[] arr1, int[] arr2) {
		Set<Integer>set = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		return set.toArray();
	}

	private static Object[] getIntersection(int[] arr1, int[] arr2) {
		Set<Integer>set = new HashSet<Integer>();
		Set<Integer>intersection = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if(set.contains(arr2[i]))
				intersection.add(arr2[i]);
		}
		return intersection.toArray();
	}

}
