import java.util.Scanner;

public class FactorialRecurtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 6;
		int result = factorial(num);
		System.out.println(result);
	}
	private static int factorial(int n) {
		if(n == 1 || n == 0)
			return n;
		else
		return n*factorial(n-1);
	}

}
