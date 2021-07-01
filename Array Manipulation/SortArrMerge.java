import java.util.Arrays;

/*
 * We need to merge these two arrays such that the initial numbers 
 * (after complete sorting) are in the first array and the remaining numbers are in the second array. 
 * Extra space allowed in O(1).
 * 
 * Input: ar1[] = {1, 5, 9, 10, 15, 20};
       ar2[] = {2, 3, 8, 13};
Output: ar1[] = {1, 2, 3, 5, 8, 9}
        ar2[] = {10, 13, 15, 20}
 */
public class SortArrMerge {

	public static void main(String[] args) {
		int arr1[] = {1,3,5,7};
		int arr2[] = {0,2,6,8,9};
		System.out.println( Arrays.toString(getMergedSorted(arr1,arr2)) );
	}
	private static int[] getMergedSorted(int[] arr1, int[] arr2) {
		int merged[] = new int[arr1.length+arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < arr1.length && j < arr2.length)
		{
			merged[k]=(arr1[i]<arr2[j] ? arr1[i++]: arr2[j++]);
			k++;
		}
		while(i < arr1.length) {
			merged[k] = arr1[i];
			i++;k++;
		}
		while(j < arr2.length) {
			merged[k] = arr2[j];
			j++;k++;
		}	
		return merged;
	}
}