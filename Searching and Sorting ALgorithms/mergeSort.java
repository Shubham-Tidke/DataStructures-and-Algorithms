import java.util.Arrays;

/*		O(nlogn)
 *  It works on the principle of Divide and Conquer. Merge sort repeatedly breaks down a list into several sublists until 
 *  each sublist consists of a single element and merging those sublists in a manner that results into a sorted list.
 */
public class mergeSort {
	public static void main(String[] args) {
		int arr[] = {25, 17, 31, 13, 2};
		merge(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	private static void merge(int[] arr, int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			merge(arr,start,mid);
			merge(arr,mid+1,end);
			mergeHelper(arr,start,mid,end);
		}
	}
	private static void mergeHelper(int[] arr, int start, int mid, int end) {
		int result[] = new int[arr.length];
		int i = start,j=mid+1,k=0;
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				result[k] = arr[i];
				k++;i++;
			}
			else {
				result[k] = arr[j];
				k++;j++;
			}
		}
		while(i<=mid) {
			result[k] = arr[i];
			k++;i++;
		}
		while(j<=end) {
			result[k] = arr[j];
			j++;k++;
		}
		for (int k2 = start; k2 <= end; k2++) {
			arr[k2] = result[k2-start];
		}
	}
	
}