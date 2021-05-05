import java.util.HashSet;
/*
Given an array arr of size n and an integer X. 
Find if there's a triplet in the array which sums up to the given integer X.

Example 1:
Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.

Example 2:

Input:
n = 5, X = 10
arr[] = [1 2 4 3 6]
Output:
1
 */
public class tripletSumArr {

	public static void main(String[] args) {
		int n = 5;
		int x = 10;
		int []arr = {1,2,4,3,6};
		tripletSumArr obj = new tripletSumArr();
		System.out.println(obj.tripletSum(arr,x));
	}
	private int tripletSum(int[] arr, int x) {
		for (int i = 0; i < arr.length-2; i++) {
			HashSet<Integer>set = new HashSet<Integer>();
			for (int j = i+1; j < arr.length; j++) {
				if(set.contains(x-arr[i]-arr[j]))
				{
					return 1;
				}
				set.add(arr[j]);
			}
		}
		return 0;
	}
}