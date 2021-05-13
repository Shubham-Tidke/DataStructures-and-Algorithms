import java.util.Scanner;

public class Recursive_bubbleSort {
		static Scanner sc  = new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Size of array : ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter elements to sort : ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			bubbleSort(arr,n);
			printArr(arr);		
	}
		private static void bubbleSort(int[] arr, int n)
		{
			for (int i = 0; i < n-1; i++) {
				if(arr[i]>arr[i+1])
				{
					arr[i] = arr[i]+arr[i+1];
					arr[i+1] = arr[i]-arr[i+1];
					arr[i] = arr[i]-arr[i+1];
				}
				bubbleSort(arr, n-1);
			}
		}
		private static void printArr(int[] arr)
		{
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
}