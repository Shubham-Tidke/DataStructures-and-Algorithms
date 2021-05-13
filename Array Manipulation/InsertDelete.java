/*Problem -
Take a SORTED array and write functions to perform insert and delete operations keeping the array sorted.
Note - Use predefined java search function if you need to search for the index in your code.
Please take all the inputs from the user.
Please cover corner cases if any
Write functions - 
a. insert(int[] arr, int valueToBeInserted)
Description - return -1 if capacity of array is full
b. delete(int[] arr, int valueToBeDeleted)
Description - return -1 if element not present
*/
import java.util.Arrays;
import java.util.Scanner;
public class InsertDelete {
static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		int option;
		System.out.println("SIZE OF ARRAY : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}	
		do {
			System.out.println("Select Operation : 1. Insert in array 2. Delete from array 3. Exit ");
			option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Value to insert : ");
				int value = sc.nextInt();
				insertOperation(arr,value);
				break;				
			}
			case 2:{
				System.out.println("Value to delete : ");
				int value = sc.nextInt();
				deleteOperation(arr,value);
				break;
			}			
		}			
	} while (option<3);		
}	
	private static void deleteOperation(int[] arr, int value) {
		 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == value)
			{
				arr[i] = -1;
			}
		}
		CheckEmptySpace(arr);
		System.out.println(value +" Deleted from array");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	private static void insertOperation(int[] arr, int value) {
		int space = CheckEmptySpace(arr);
		if(space == 0)
			System.out.println("Sorry! Array is already full.");
		else
		{
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==-1)
				{
					arr[i] = value;
					System.out.println(value+" added in array");
					break;
				}			
			}
			Arrays.sort(arr);
		}	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();	
	}
	private static int CheckEmptySpace(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == -1)
				count++;
		}
		return count;		
	}
}