import java.util.Arrays;
import java.util.Stack;

/*
The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and
we need to calculate the span of stock’s price for all n days. 
The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day,
for which the price of the stock on the current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85},
then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.

Input: 
N = 7, price[] = [100 80 60 70 60 75 85]
Output:
1 1 1 2 1 4 6
Explanation:
Traversing the given input 
span for 100 will be 1,
80 is smaller than 100 so the span is 1,
60 is smaller than 80 so the span is 1,
70 is greater than 60 so the span is 2 and so on.
 Hence the output will 
be 1 1 1 2 1 4 6
 */
public class stockSpan {
	public static void main(String[] args) {
		int price[] = {100,80,60,70,60,75,85};	
		System.out.println(Arrays.toString(getSpan(price,price.length)));
	}
	private static int[] getSpan(int[] price, int length) {
		int arr[] = new int[price.length];
		Stack<Integer> stack = new Stack<Integer>();
		arr[0] = 1;
		stack.push(0);
		for (int i = 1; i < arr.length; i++) {
			while(!stack.isEmpty() && price[stack.peek()]<=price[i])
				stack.pop();
			arr[i] =(stack.isEmpty()?(i+1):i-stack.peek());
			stack.push(i);
		}
		return arr;
	}
}