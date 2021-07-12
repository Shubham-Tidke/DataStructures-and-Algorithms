import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 *  and return an array of the non-overlapping intervals that cover all the intervals in the input
 *  Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 *  Output: [[1,6],[8,10],[15,18]]
 *  Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 */
public class mergeIntervals {

	public static void main(String[] args) {
		int [][] arr = {{1,3},{2,6},{8,10},{15,18}};
		int [][]solution  =  getMerged(arr);
		for (int i = 0; i < solution.length; i++) {
			for (int j = 0; j < solution[0].length; j++) {
				System.out.print(solution[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] getMerged(int[][] arr) {
		List<int[]> list = new ArrayList<int[]>();
		int start[] = new int[arr.length];
		int  end[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			start[i] = arr[i][0];
			end[i]=arr[i][1];
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int startIndex = 0;
		int endIndex = 0;
		while(endIndex < arr.length) {
			if(endIndex == arr.length-1 || start[endIndex+1] > end[endIndex])
			{
				list.add(new int[] {start[startIndex],end[endIndex]});
				startIndex = endIndex+1;
			}
			endIndex++;
		}
		
		return list.toArray(new int[list.size()][]);
	}

}
