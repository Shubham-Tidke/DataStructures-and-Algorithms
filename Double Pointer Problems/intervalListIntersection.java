import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * You are given two lists of closed intervals, firstList and secondList, 
 * where firstList[i] = [starti, endi] and secondList[j] = [startj, endj].
 *  Each list of intervals is pairwise disjoint and in sorted order.
 *  Return the intersection of these two interval lists.
 *  A closed interval [a, b] (with a < b) denotes the set of real numbers x with a <= x <= b.
 *  The intersection of two closed intervals is a set of real numbers that are either empty
 *   or represented as a closed interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].
Example 1:
Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
Output: [[1,2],[8,10],[15,23],[24,24],[25,25]]
Example 2:
Input: firstList = [[1,3],[5,9]], secondList = []
Output: []
Example 3:
Input: firstList = [], secondList = [[4,8],[10,12]]
Output: []
Example 4:
Input: firstList = [[1,7]], secondList = [[3,10]]
Output: [[3,7]]
 */
public class intervalListIntersection {
	public static void main(String[] args) {
		int[][]arr1 = {{0,2},{5,10},{13,23},{24,25}}; 
		int[][]arr2 = {{1,5},{8,12},{15,24},{25,26}};
		int arr[][]= (getIntersection(arr1,arr2));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(Arrays.toString(arr[i])+" ");
		}
	}
	private static int[][] getIntersection(int[][] arr1, int[][] arr2) {
		List<int[]>list = new ArrayList<int[]>();
		int i = 0; int j = 0;
		while(i<arr1.length && j<arr2.length) {
			int[]temp1 = arr1[i];
			int[]temp2 = arr2[j];
			if(temp1[1]<temp2[0]) //no intersection if 1st arr-element ends ealry
				i++;
			else if(temp1[0]>temp2[1]) //no intersection if 2nd arr-element ends ealry
				j++;
			else {
				int first = Math.max(temp1[0], temp2[0]);//starting point of intersection
				int last = Math.min(temp1[1], temp2[0]);//ending point of intersection
				list.add(new int[] {first,last});
				if(temp1[1]<temp2[1])i++;
				else if(temp2[1]>=temp2[1])j++;
			}
		}	
		return list.toArray(new int[list.size()][]);
	}
}