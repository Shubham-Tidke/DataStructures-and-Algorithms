import java.util.Arrays;

/*
 * Input : 
 * arr[] = {1, 3, 5, 7, 9}
 * k1 = 1
 * k2 = 3
 * k3 = 4
 * k4 = 6
Output : 
3 5 7 9 1
7 9 1 3 5
9 1 3 5 7
3 5 7 9 1
 */
public class leftRotation {
	public static void main(String[] args) {
		int[]arr= {1,3,5,7,9};
		int k = 13;
		System.out.println(Arrays.toString(rotateLeft(arr,k)));
	}
	private static int[] rotateLeft(int[] arr, int k) {
		  k=k%arr.length;
		  int[]result = new int[arr.length];
		  for (int i = 0; i < result.length; i++) {
			result[i] = arr[(i+k)%arr.length];
		}     
		return result;
	}
}