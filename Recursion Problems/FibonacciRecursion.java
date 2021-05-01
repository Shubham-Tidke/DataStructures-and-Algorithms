import java.util.Scanner;

/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
such that each number is the sum of the two preceding ones, starting from 0 and 1. 
That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 */
public class FibonacciRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 25;	
		for (int i = 0; i < input; i++) {
			System.out.println(fibo(i)+" ");
		}	 	
	}
	private static int fibo(int input) {
		if(input == 0)
			return 0;
		if(input == 1 || input == 2)
			return 1;
		return fibo(input-1)+fibo(input-2);	
	}
}