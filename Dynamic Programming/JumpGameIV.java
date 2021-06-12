import java.util.PriorityQueue;
/*
 * You are given a 0-indexed integer array nums and an integer k.You are initially standing at index 0.
 *  In one move, you can jump at most k steps forward without going outside the boundaries of the array.
 *  That is, you can jump from index i to any index in the range [i + 1, min(n - 1, i + k)] inclusive.
 *  You want to reach the last index of the array (index n - 1).
 *  Your score is the sum of all nums[j] for each index j you visited in the array.Return the maximum score you can get.
Example 1:
Input: nums = [1,-1,-2,4,-7,3], k = 2
Output: 7
Explanation: You can choose your jumps forming the subsequence [1,-1,4,3] (underlined above). The sum is 7.
Example 2:
Input: nums = [10,-5,-2,4,0,3], k = 3
Output: 17
Explanation: You can choose your jumps forming the subsequence [10,4,3] (underlined above). The sum is 17.
Example 3:
Input: nums = [1,-5,-20,4,-1,3,-6,-3], k = 2
Output: 0
 
 */
public class JumpGameIV {

	public static void main(String[] args) {
		int nums[] = {10,-5,-2,4,0,3};
		int k = 3;
		System.out.println(getMaximumScore(nums,k));
	}
	private static int getMaximumScore(int[] nums, int k) {
		 PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
	        pq.add(new Pair(0, nums[0]));
	        int max = nums[0];
	        for(int i = 1;i<nums.length;i++){
	            
	            while(pq.peek().index <i-k){
	                pq.poll();
	            }
	            
	            max = pq.peek().val + nums[i];
	            pq.add(new Pair(i,  max));
	        }
	        
	        return max;
	}
	static class Pair implements Comparable<Pair>{
        int index;
        int val;
        
        Pair(int index, int val){
            this.index = index;
            this.val = val;
        }
        
        
        public int compareTo(Pair o){
            return o.val - this.val;
        }
    }

}
