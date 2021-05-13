/*Problem - 
1. Take an array and perform Bubble Sort
2. Improve time complexity from O(n^2) to lesser
3. Understand and Perform recursive bubble sort 
(https://www.geeksforgeeks.org/java-program-for-recursive-bubble-sort/?ref=rp)
 
*/
import java.util.Scanner;
public class BubbleSort {
static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements to sort : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		BubbleSort b = new BubbleSort();
		b.bubbleSort(arr);
	}
	private void bubbleSort(int[] arr) {	
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}