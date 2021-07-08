import java.util.Arrays;

/*
 * You are given a rectangular cake of size h x w and two arrays of integers horizontalCuts and verticalCuts where:
    horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, and
    verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.
Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays
horizontalCuts and verticalCuts. Since the answer can be a large number, return this modulo 10^9 + 7.
Input: h = 5, w = 4, horizontalCuts = [1,2,4], verticalCuts = [1,3]
Output: 4 
Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts.
 After you cut the cake, the green piece of cake has the maximum area.
 */
public class MaxAreaOfPiece {
	
	public static void main(String[] args) {
		int h = 1000000000;
		int w = 1000000000;
		int []horizontalCuts = {2};
		int []verticalCuts = {2};
		System.out.println(getmaxArea(h,w,horizontalCuts,verticalCuts));
	}
	private static int getmaxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
		Arrays.sort(horizontalCuts);
		Arrays.sort(verticalCuts);
		//max set to first cut or last cut
		int verticalMax = Math.max(verticalCuts[0],w - verticalCuts[verticalCuts.length-1]);
		int horizontalMax = Math.max(horizontalCuts[0],h - horizontalCuts[horizontalCuts.length-1]);
		
		//max update
		for (int i = 0; i < verticalCuts.length-1; ++i) {
			verticalMax = Math.max(verticalMax,verticalCuts[i+1]-verticalCuts[i]);
		}
		for (int i = 0; i < horizontalCuts.length-1; ++i) {
			horizontalMax = Math.max(horizontalMax,horizontalCuts[i+1]-horizontalCuts[i]);
		}
		return (int)((long)horizontalMax*verticalMax%1000000007);
	}
}