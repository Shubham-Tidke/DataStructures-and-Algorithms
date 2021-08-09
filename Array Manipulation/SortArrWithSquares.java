import java.util.Arrays;

public class SortArrWithSquares {

	public static void main(String[] args) {
		int arr[]  = {-3,-2,-1,0,1,2,3};
		System.out.println(Arrays.toString(getSquares(arr)));
	}
	private static int[] getSquares(int[] A) {
		int ans[] = new int[A.length];
        int i = 0, j = A.length - 1, index = A.length - 1;
        
        while(i <= j){
            if(i == j){
                ans[index--] = A[i] * A[i];
                break;
            } 
            int val1 = Math.abs(A[i]);
            int val2 = Math.abs(A[j]);
            
            if(val1 > val2){
                ans[index--] = val1 * val1;
                i++;
            } else{
                ans[index--] = val2 * val2;
                j--;
            }
        }
        return ans;
	}
}