import java.util.PriorityQueue;

/*
There are given N ropes of different lengths, we need to connect these ropes into one rope.
The cost to connect two ropes is equal to sum of their lengths. 
The task is to connect the ropes with minimum cost
Input:
n = 5
arr[] = {4, 2, 7, 6, 9}
Output: 
62 
Explanation:
First, connect ropes 4 and 2, which makes
the array {6,7,6,9}. Next, add ropes 6 and
6, which results in {12,7,9}. Then, add 7
and 9, which makes the array {12,16}. And
finally add these two which gives {28}.
Hence, the total cost is 6 + 12 + 16 + 
28 = 62.

Expected Time Complexity : O(nlogn)
Expected Auxilliary Space : O(n)
 */
public class minCostOfRopes {

	public static void main(String[] args) {
		int []arr = {4,3,2,6};
		System.out.println(getMinCost(arr));
	}

	private static int getMinCost(int[] arr) {
		int sum=0;
		PriorityQueue<Integer>q = new PriorityQueue<Integer>();//adding small ropes first
		for (int i = 0; i < arr.length; i++) {
			q.add(arr[i]);
		}
		while(q.size()!=1){
			int num = q.poll()+q.poll();
			sum+=num;
			q.add(num);
		}
		return sum;
	}
}