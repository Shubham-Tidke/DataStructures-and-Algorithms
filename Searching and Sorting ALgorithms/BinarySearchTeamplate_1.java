import java.util.Arrays;

//https://leetcode.com/problems/koko-eating-bananas/
/*
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
 * The guards have gone and will come back in h hours.Koko can decide her bananas-per-hour eating speed of k. Each hour,
 * she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas,
 * she eats all of them instead and will not eat any more bananas during this hour.
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 * 
 * Input: piles = [3,6,7,11], h = 8 Output: 4
 * Input: piles = [30,11,23,4,20], h = 6 Output: 23
 */
public class BinarySearchTeamplate_1 {

	public static void main(String[] args) {
		int []piles = {30,11,23,4,20};
		int hrs = 6;
		System.out.println(getEatingSpeed(piles,hrs));
	}
	private static int getEatingSpeed(int[] piles, int hrs) {
		Arrays.sort(piles);
		int maxPiles = piles[piles.length-1];
//		for (int i = 0; i < piles.length; i++) {
//			maxPiles = (maxPiles < piles[i])?piles[i]:maxPiles;
//		}
		int minPiles = 0;
		while(minPiles < maxPiles) {
			int count  = 0;
			int mid = (minPiles+maxPiles)/2;
			for(int pile:piles) {
				count+= Math.ceil((double)pile/mid);
			}
			if(count > hrs) 
				minPiles = mid+1;
			else maxPiles = mid;
		}
		
		return minPiles;
	}

}
