import java.util.Arrays;
/*
 * Given a number n, find the smallest number that has same set of digits as n and is greater than n.
 * If n is the greatest possible number with its set of digits, then print “not possible”.
 * 
 * Input:  n = "218765"
 * Output: "251678"
 * 
 * Input: n = "4321" 
 * Output: "Not Possible"

 */
public class nextGreater {
	public static void main(String[] args) {
		String n = "218765";
		System.out.println(getNextGreater(n));
	}
	private static String getNextGreater(String n) {
		char[]arr = n.toCharArray();
		int i;
		//find the smallest from right to left
		for ( i = arr.length-1; i > 0; i--) {
			if(arr[i] > arr[i-1])
				break;
		}
		//if smallest is already at last,next greater is not possible
		if(i == 0)
			return "not possible";
		else {
			//find the next greater from current found index of greater,to swap
			int temp = arr[i-1];
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] > temp && arr[j] < arr[min])
					min = j;
			}
		//swap 
			char swap = arr[i-1];
			arr[i-1] = arr[min];
			arr[min] = swap;
			//to get smallest of subarray number
			Arrays.sort(arr,i,arr.length);
		}
		return String.valueOf(arr);
	}
}