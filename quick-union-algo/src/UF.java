import java.util.Scanner;

// Lazy approach!

public class UF {
	private static int[] id;
	
	private static void UF(int n) {
		// TODO Auto-generated method stub
		id = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = i;
		}	
	}	
	private static boolean Connected(int first, int second) {	
		return root(first)==root(second);
	}

	private static int root(int i) {
		while(i!=id[i])
			i = id[i];
		return i;
		
	}
	private static void union(int first, int second) {
		int i = root(first);
		int j = root(second);
		id[i] = j;
		System.out.println(first+" & "+second+" are connected now!!");
		
	}
	
	public static void showConnections()	
	{
		System.out.println("indices with same value are connected!");
		for (int i = 0; i < id.length; i++) {
			System.out.println(i +" -> "+id[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of elements in graph :");
		int n = sc.nextInt();
		UF(n);
		int flag;
		do {
			System.out.println("Enter P & Q [Less than "+n+" ]to create connection.");
			int first = sc.nextInt();
			int second =  sc.nextInt();
			if(Connected(first,second) == true) 
				System.out.println("Already Connected!!");
			else
				union(first,second);
			
			showConnections();
			System.out.println("\n1 to continue,\n 0 to quit\n");
			flag = sc.nextInt();
		}
		while(flag !=0);
		sc.close();
	}
	
}
