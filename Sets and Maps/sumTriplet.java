import java.util.Arrays;
import java.util.HashSet;

/*Example 1:
Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.
 */
public class sumTriplet {

	public static void main(String[] args) {
		int arr[] = {1,2,4,3,6,4};
		int x =11;
		System.out.println(findTriplets(arr,x));
	}
	private static int findTriplets(int[] arr, int x) {
		Arrays.parallelSort(arr);
		for (int i = 0; i < arr.length; i++) {
			int left = i+1;
			int right = arr.length-1;
			while(left<right) {
				if(arr[i]+arr[left]+arr[right] == x)
					return 1;
				else if(arr[i]+arr[left]+arr[right] < x)
					right--;
				else
					left++;
			}
		}
		return 0;
	}
}