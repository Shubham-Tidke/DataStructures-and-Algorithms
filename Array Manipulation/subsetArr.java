/*
Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:
Input: nums = [0]
Output: [[],[0]]
 */
public class subsetArr {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		printSubsets(arr);
	}
	private static void printSubsets(int[] arr) {
		//bitwise operator
		for (int i = 0; i < (1<<arr.length); i++) {
			System.out.print("{ ");
			for (int j = 0; j < arr.length; j++) {
				if( (i & (1<<j)) > 0 ) {
					System.out.print(arr[j]+" ");
				}
			}
			System.out.print("}");
		}
	}
}