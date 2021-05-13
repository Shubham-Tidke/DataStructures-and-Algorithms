import java.util.*;

public class SumOfPairsUsingHashSet {
	public static void main(String[] args) {
		int arr[] = {0,-1,2,-3,1};
		int sum = 0;
		sumOfPairs(arr,sum);
	}
	private static void sumOfPairs(int[] arr, int sum) {
		HashSet<Integer>set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			int temp = sum-arr[i];
			if(set.contains(temp))
			{
				System.out.println("required pair : "+arr[i]+","+temp);
			}
			else
				set.add(arr[i]);
		}	
	}
}