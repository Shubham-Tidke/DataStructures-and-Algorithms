/*
 * Given an array of positive numbers, find the maximum sum of a subsequence with the constraint that
 *  no 2 numbers in the sequence should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10) 
 *  or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).Answer the question in most efficient way.
Input : arr[] = {5, 5, 10, 100, 10, 5}
Output : 110
Input : arr[] = {1, 2, 3}
Output : 4

Input : arr[] = {1, 20, 3}
Output : 20
 */
public class noAdjMaximum {
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		System.out.println(getNonAdjMax(arr));
	}
	private static int getNonAdjMax(int[]a ) {
		int n = a.length;
		 if(n==1){
		        return a[0];
		    }
		    if(n==2){
		        return Math.max(a[0],a[1]);
		    }
		    int[]dp=new int[n];
		    dp[0]=a[0];
		    dp[1]=Math.max(dp[0],a[1]);
		    for(int i=2;i<n;i++){
		        dp[i]=Math.max(dp[i-1],dp[i-2]+a[i]);
		    }
		    return dp[n-1];
	}
}