import java.util.Arrays;

/*
 * Given an n x n matrix where each of the rows and columns are sorted in ascending order,
 *  return the kth smallest element in the matrixNote that it is the kth smallest element in the sorted order,
 *   not the kth distinct element.
 *   Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
 *   Output: 13
 *   Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
 */
public class matrixKthSmallest {

	public static void main(String[] args) {
		int [][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
		int k = 8;
		System.out.println(getKthSmall(matrix,k));
	}

	private static int getKthSmall(int[][] matrix, int k) {
		int arr[] = new int[matrix.length*matrix.length];
		int count =0 ;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				arr[count++] = matrix[i][j];
			}
		}
		Arrays.sort(arr);
		return arr[k-1];
	}

}
