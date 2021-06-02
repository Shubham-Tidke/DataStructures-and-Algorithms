/*
The Tribonacci sequence Tn is defined as follows: 
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.
Example 1:
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:
Input: n = 25
Output: 1389537
 */
import java.util.Scanner;
public class NthTribonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 25;	
		System.out.print(Tribonacci(input)+" ");
	}
	private static int Tribonacci(int i) {
		if(i  == 0  )
			return 0;
		if(i == 2 || i == 1)
			return 1;
		else
		return Tribonacci(i-1)+Tribonacci(i-2)+Tribonacci(i-3);	
	}

}
/* Faster solution
 * int first = 0;int second = 1;int third = 1;
		if(n<2)return n;
		for (int i = 2; i < n; i++) {
			int sum = first+second+third;
			first = second;
			second = third;
			third = sum;
		}
		return third;
 */
