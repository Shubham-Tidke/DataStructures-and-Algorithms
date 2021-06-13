/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. 
Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.

Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: Cheapest is: start on cost[1], pay that cost, and go to the top.
Example 2:
Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: Cheapest is: start on cost[0], and only step on 1s, skipping cost[3].
 */
public class minCostOfClimbing {
	public static void main(String[] args) {
		int[]cost = {10,15,20};
		System.out.println(getMinClimbingCost(cost));
	}
	private static int getMinClimbingCost(int[] cost) {
		int oneStepCost = cost[1];
		int twoStepCost = cost[0];
		int currentCost = 0;
		for (int i = 2; i < cost.length; i++) {
			currentCost = Math.min(twoStepCost,oneStepCost)+cost[i];
			twoStepCost = oneStepCost;
			oneStepCost = currentCost;
		}
		return Math.min(twoStepCost, oneStepCost);
	}
}
/* --if cost array can be modified--
 private static int getMinClimbingCost(int[] cost) {
		for (int i = 2; i < cost.length; i++) {
			cost[i]+=Math.min(cost[i-1], cost[i-2]);
		}
		return Math.min(cost[cost.length-1], cost[cost.length-2]);
	}

*/
