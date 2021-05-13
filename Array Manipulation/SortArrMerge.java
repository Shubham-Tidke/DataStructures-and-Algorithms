
import java.util.Scanner;



/*
Problem -
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. 
You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 
Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
 */
public class SortArrMerge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size 1 : ");
		int size1 = sc.nextInt();
		System.out.println("Size 2 : ");
		int size2 = sc.nextInt();
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		System.out.println("First Array[ascending] :");
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Second Array[ascending]");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int solutionArr[] = new int[size1+size2];
		int i=0,j =0,k=0;
		while(i < size1 && j < size2)
		{
			if(arr1[i] < arr2[j])
			{
				solutionArr[k] = arr1[i];
				i++;
			}
			else
			{
				solutionArr[k] = arr1[i];
				j++;
			}
			k++;	
		}
		while(i < size1)
		{
			solutionArr[k] = arr1[i];
			k++;i++;
		}
		while(j < size2)
		{
			solutionArr[k] = arr2[j];
			k++;j++;			
		}
		
		for (int k2 = 0; k2 < solutionArr.length; k2++) {
			System.out.println(solutionArr[k2]);
		}
		
		
	}

}
