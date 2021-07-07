import java.util.Arrays;

/*
 * Given an n x n matrix and a number x, find the position of x in the matrix if it is present in it.
 * Otherwise, print “Not Found”.In the given matrix, every row and column is sorted in increasing order.
 * The designed algorithm should have linear time complexity. 
 */
public class elementSearchMatrix {

	public static void main(String[] args) {
	int mat[][] = { {10, 20, 30, 40},
					{15, 25, 35, 45},
					{27, 29, 37, 48},
					{32, 33, 39, 50}
				  };
	int element = 29;
	System.out.println(Arrays.toString(getElementIndex(mat,element)));
	}

	private static int[] getElementIndex(int[][] mat, int element) {
		int solution[]=new int[2];
		
		int i = 0 ,j = mat.length-1;
		while(i<mat.length-1 && j>=0) {
			if(mat[i][j]==element)
			{
				solution[0]=i;
				solution[1]=j;
			}
			if(mat[i][j]>element)
				j--;
			else
				i++;
		}
		return solution;
	}
}