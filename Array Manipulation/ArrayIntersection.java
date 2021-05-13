import java.util.*;

/* Problem Statement -

Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */
public class ArrayIntersection {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Size1: ");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Size2 : ");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Array1 : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Array2 : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		ArrayIntersection obj = new ArrayIntersection();
			obj.intersection(arr1,arr2);
	}

	private void intersection(int[] arr1, int[] arr2) {	
		HashSet set1 = new HashSet();
		HashSet set2 = new HashSet();
		for (int i = 0; i < arr1.length; i++) {
			set1.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if(set1.contains(arr2[i]))
				set2.add(arr2[i]);
		}
		
		System.out.println(set2);	
	}
}
