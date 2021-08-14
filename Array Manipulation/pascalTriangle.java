import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
public class pascalTriangle {

	public static void main(String[] args) {
		int rows = 5;
		System.out.println(getPascalTriangle(rows));
	}
	private static List<List<Integer>> getPascalTriangle(int rows) {
		List<List<Integer>>triangle = new ArrayList<List<Integer>>();
		for (int i = 0; i < rows; i++) {
			List<Integer>list = new ArrayList<Integer>();
			for (int j = 0; j <= i ; j++) {
				if(j == 0 || j == i)
					list.add(1);
				else {
					list.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
				}
			}
			triangle.add(list);
		}
		return triangle;
	}
}
