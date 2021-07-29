/*
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3^x.

Input: n = 27
Output: true

x log 3 = log 27
x = log 27/log 3

 */
public class powerOfThree {
	public static void main(String[] args) {
		int n = 243;
		System.out.println(isPowerofThree(n));
	}
	private static boolean isPowerofThree(int n) { 
		return (Math.log10(n)/Math.log10(3))%1==0;
	}
}
