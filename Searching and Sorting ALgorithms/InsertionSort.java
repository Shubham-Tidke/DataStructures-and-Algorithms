import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("No. of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter values : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		InsertionSort sort  = new InsertionSort();
		sort.insertion(arr);
		

	}

	private void insertion(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if(arr[j]<arr[j-1]) {
					temp = arr[j];
					arr[j] =arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
