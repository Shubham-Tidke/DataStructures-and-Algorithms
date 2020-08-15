import java.util.Scanner;
//Lazy approach improvement [Path Compression]Linking nodes to their grandparents
public class UF {

	private static int id [];
	private static int SZ[] ;
	private static void uf(int n) {
		
		id = new int[n];
		SZ = new int[n];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
			SZ[i] = 1;
		}
	}
	private static boolean Connected(int first, int second) {
		
		return (root(first) == root(second));
	}
	private static int root(int i) {
		while(i!=id[i]) {
			id[i] = id[id[i]]; //Improvement
			i = id[i];
		}
			
		return i;		
	}
	private static void union(int first, int second, int[] SZ) {
		int i = root(first);
		int j = root(second);
		if(i == j)
			return;
		if(SZ[i] <= SZ [j])
		{	id[i] = j;
			SZ[j] += SZ[i];
			System.out.println(first+" & "+second+" are connected now!!");
		}
		else {
			id[j] = i;
			SZ[i] +=SZ[j];
			System.out.println(first+" & "+second+" are connected now!!");
			
		}
	}
	private static void showConnections() {
		System.out.println("indices with same value are connected!");
		for (int i = 0; i < id.length; i++) {
			System.out.println(i +" -> "+id[i]);
		}
		System.out.println("-----------");
		shoeSZ();
		
	}	
	private static void shoeSZ() {
		for (int i = 0; i < id.length; i++) {
			System.out.println(i +" -> "+SZ[i]);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of elements in graph :");
		int n = sc.nextInt();
		uf(n);
		int flag;
		do {
			System.out.println("Enter P & Q [Less than "+n+" ]to create connection.");
			int first = sc.nextInt();
			int second =  sc.nextInt();
			if(Connected(first,second) == true) 
				System.out.println("Already Connected!!");
			else
				union(second,first,SZ);
			
			showConnections();
			System.out.println("\n1 to continue,\n 0 to quit\n");
			flag = sc.nextInt();
		}
		while(flag !=0);
		sc.close();
	}
}
