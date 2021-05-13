import java.util.Scanner;
/* Problem Statement -
LEFT ROTATION OF AN ARRAY
Given an array of size n and multiple values around which we need to left rotate the array. 
Basically, take an array and a value k which defines number of left rotations.
Function required - leftRotate(arr,k);
Examples : 
Input : 
arr[] = {1, 3, 5, 7, 9}
k1 = 1
k2 = 3
k3 = 4
k4 = 6

Output : 
3 5 7 9 1
7 9 1 3 5
9 1 3 5 7
3 5 7 9 1

 */
public class ArrayLeftRot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Array size : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("No. of rotations : ");
		int k = sc.nextInt();
		ArrayLeftRot obj  = new ArrayLeftRot();
		obj.rotate(arr,k);
	}
	private void rotate(int[] arr, int k) { 
		int j = 0;
		for (int i = 0; i < k; i++) {
			int first = arr[0]; 
			for ( j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j+1];
			} 
			arr[j] = first; 
		}		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
