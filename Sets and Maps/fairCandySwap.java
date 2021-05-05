import java.util.HashSet;

/*
Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has,and B[j] is the
size of the j-th bar of candy that Bob has.
Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy. 
(The total amount of candy a person has is the sum of the sizes of candy bars they have.)
Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.
If there are multiple answers, you may return any one of them. It is guaranteed an answer exists.

Example 1:
Input: A = [1,1], B = [2,2]
Output: [1,2]

Example 2:

Input: A = [1,2], B = [2,3]
Output: [1,2]

 */
public class fairCandySwap {
	public static void main(String[] args) {
	int []a = {1,2,5};
	int []b = {2,4};
	candyExchange(a,b);
	}
	private static void candyExchange(int[] a, int[] b) {
		int sumA = 0;int sumB = 0;
		for (int i = 0; i < a.length; i++) {
			sumA+=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			sumB+=b[i];
		}
		HashSet<Integer>set = new HashSet<Integer>();
		for (int i = 0; i < b.length; i++) {
			set.add(b[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if(set.contains(a[i]+(sumB-sumA)/2))
			{
				System.out.println(a[i]+" "+(a[i]+(sumB-sumA)/2));
				break;
			}
		}
	}
}