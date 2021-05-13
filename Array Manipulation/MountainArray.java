/*
 * Problem -
Given an array of integers arr, return true if and only if it is a valid mountain array.
Note that arr is a mountain array if and only if:
1. arr.length >= 3
2. There exists some i with 0 < i < arr.length - 1 such that:
	arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
	arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * 
 */
import java.util.Scanner;
public class MountainArray {
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		MountainArray m = new MountainArray();
		m.MountainCheck(arr);
	}
	private void MountainCheck(int[] arr) {
		int temp1 = 0;
		int temp2 =0;
		int flagup = 0;
		int flagdown = 1;		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] >= arr[i+1])
			{
				temp1 = i;
				flagup = 1;
				break;
			}			
		}
	//	System.out.println("flagup :"+flagup);
			for (int i = temp1+1; i < arr.length; i++) {
				if(arr[i-1]>arr[i])
				{
					temp2++;
				}		
			}
	//	System.out.println("flagDown :"+flagdown);
	//	System.out.println(temp1+""+temp2);	
		if(flagdown == 1 && flagup == 1 )
		{
			if(temp1+temp2+1 == arr.length && arr.length>=3)
			{
				System.out.println("true");
			}
			else
				System.out.println("false");
		}
		else
			System.out.println("false");
	}
}