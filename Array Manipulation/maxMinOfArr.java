/*
Write a function to return minimum and maximum in an array.
Your program should make the minimum number of comparisons. 
https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */
public class maxMinOfArr {
	static class Pair{
		int min;
		int max;
	}
	public static void main(String[] args) {
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		Pair pair = getMinMax(arr,0,arr.length-1);
		System.out.println(pair.min);
		System.out.println(pair.max);
	}
	private static Pair getMinMax(int[] arr, int low, int high) {
		Pair minmax = new Pair();
		Pair temp1 = new Pair();
		Pair temp2 = new Pair();
		int mid;
		
		//one element in arr
		if(low==high) {
			minmax.max=minmax.min=arr[low];
			return minmax;
		}
		
		//2 elements in arr
		if(high==low+1) {
			minmax.min=(arr[low]<arr[high] ? arr[low]:arr[high]);
			minmax.max=(arr[low]>arr[high] ? arr[low]:arr[high]);
			return minmax;
		}
		
		//more than 2 in arr
		mid = (low+high)/2;
		temp1 = getMinMax(arr, low, mid);
		temp2 = getMinMax(arr, mid+1, high);
		
		minmax.min = (temp1.min < temp2.min ? temp1.min:temp2.min);
		minmax.max = (temp1.max > temp2.max ? temp1.max:temp2.max);
		return minmax;
	}
}
