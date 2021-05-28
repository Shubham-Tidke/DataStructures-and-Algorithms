/*Given an integer n, return the least number of perfect square numbers that sum to n.
A perfect square is an integer that is the square of an integer; 
in other words, it is the product of some integer with itself. 
For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
Example 1:
Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.
Example 2:
Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
 */
public class prefectSquares {
/*Lagrange's theorem : any no. can be represented in squares of 4 numbers , x = a^2 + b^2 + c^2 + d^2
 * so Maximum answer is 4
Legendre's theorem : if number is not in form of 4^a(8*b+7),a,b>0,
any no can be represented in squares of 3 number else 4 numbers */
	public static void main(String[] args) {
		int n = 13;
		System.out.println(getCountOfPefectSquares(n));
	}
	private static int getCountOfPefectSquares(int n) {
		if(Math.ceil(Math.pow(n, 0.5)) == Math.floor(Math.pow(n, 0.5)) ) //if number itself is perfect square;
			return 1;
		if(n<=3)
			return n; 
		 //Legendre's 4 number case
		 while(n%4 == 0)//4^a(8*b+7)
			 n/=4;
		 if(n%8 == 7)
			 return 4;
		 //check for 2
		 for (int i = 0; i*i < n; ++i) {
			if(Math.ceil(Math.sqrt(n-i*i)) == Math.floor(Math.sqrt(n-i*i)) )
				return 2;	
		}
		//if not 1,2,4 then 3
		return 3;
	}

}
