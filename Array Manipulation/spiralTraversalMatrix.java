/*
Input:  1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
        
Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Explanation: The output is matrix in spiral format.
 */
public class spiralTraversalMatrix {

	public static void main(String[] args) {
	int a[][] = {{ 1, 2, 3, 4, 5, 6 },
                 { 7, 8, 9, 10, 11, 12 },
                 { 13, 14, 15, 16, 17, 18 } };
	//System.out.println(a.length+" "+a[0].length);
		 getSprialTraversal(a,a.length,a[0].length);

	}

	private static void getSprialTraversal(int[][] arr, int row, int column) {
		int  i;
		int k = 0;
		int l = 0;
		while(k<row && l<column) {
			//first row
			for ( i = l; i < column; ++i) {
				System.out.println(arr[k][i]+" ");
			}
			k++; 
			
			//last column
			for (i = k; i < row; ++i) {
				System.out.println(arr[i][column-1]+" ");
			}
			column--;
			
			//last row of remainings
			if(k<row) {
				for(i = column-1; i>= l; --i) {
					System.out.println(arr[row-1][i]+" ");
				}
				row--;
			}
			
			//first column of remainings
			if(l<column) {
				for(i = row-1; i>= k; --i) {
					System.out.println(arr[i][l]+" ");
				}
				l++;
			}
			
		}
		
	}

}
