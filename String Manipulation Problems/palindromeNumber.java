
public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println(isPalindrome(num));
	}

	private static boolean isPalindrome(int num) {
		if(num<0)return false;
		StringBuilder str = new StringBuilder();
		str.append(num);
		System.out.println(str.toString());
		return str.toString().equals(str.reverse().toString());
	}

}
