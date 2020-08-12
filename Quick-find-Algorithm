import java.util.Scanner;

//Eager's approach
public class UF {

	private static int[] id;
	public static void UF(int N)	//constructor
	{
		id = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}
	public static void showConnections()	
	{
		System.out.println("indices with same value are connected!");
		for (int i = 0; i < id.length; i++) {
			System.out.println(i +" -> "+id[i]);
		}
	}
	public static boolean connected(int p,int q)
	{
		return id[p] == id[q];
	}
	public static void union(int p,int q)
	{
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++) {
			if(id[i] == pid)
				id[i] = qid;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements");
		int num = sc.nextInt();
		UF(num);
		int flag1;
		do {
		System.out.println("enter numbers [Less than "+num+"] to connect.");
		int first = sc.nextInt();
		int second = sc.nextInt();
		union(first, second);
		if(connected(first, second) == true)
		{
			System.out.println("Connected!!");
		}
		showConnections();
		
		System.out.println("Continue?[1 or 0]");
		flag1 = sc.nextInt();
		}
		while(flag1!=0);
		sc.close();
	}
	
}
