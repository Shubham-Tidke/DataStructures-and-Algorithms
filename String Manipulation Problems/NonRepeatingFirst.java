/*
 * Given a string, find the first non-repeating character in it. 
For example, 
	if the input string is “GeeksforGeeks”, then the output should be ‘f’ 
	if the input string is “GeeksQuiz”, then the output should be ‘G’. 
 */
import java.util.Scanner;
public class NonRepeatingFirst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String : ");
		String str = sc.nextLine();
		
		NonRepeatingFirst obj = new NonRepeatingFirst();
		obj.nonRepeating(str);
		

	}

	private void nonRepeating(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			char ch1 =str.charAt(i);
			int flag = 0;
			for (int j = i+1; j < str.length(); j++) {
				char ch2 = str.charAt(j);
			//	System.out.println(ch1+" "+ch2);
				if(ch1==ch2)
				{
					flag=1;
				}

			}
			if(flag == 0)
			{
				System.out.println(ch1);
				break;
			}
			
		}	
	}

}
