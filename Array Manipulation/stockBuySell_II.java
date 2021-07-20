/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * Find the maximum profit you can achieve. You may complete as many transactions as you like 
 * (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * 
 * Input: prices = [7,1,5,3,6,4] Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 */
public class stockBuySell_II {

	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		System.out.println(getProfit(prices));
	}
	private static int getProfit(int[] prices) {
		int buy = 0;
		int sell = 0;
		int profit = 0;
		int i = 0;
		while(i<prices.length-1) {
			//get smallest next value to buy 
			while(i<prices.length-1 && prices[i+1]<= prices[i])
				i++;
			buy = prices[i];
			//get highest next to sell
			while(i<prices.length-1 && prices[i+1]>prices[i])
				i++;
			sell = prices[i];
			profit += sell - buy;
		}
		return profit;
	}
}