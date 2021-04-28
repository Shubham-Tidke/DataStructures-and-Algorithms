/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 
 */
import java.util.Scanner;
import java.util.Stack;
public class ReverseVowles {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter String[lowercase] : ");
		String str = sc.nextLine();
		ReverseVowles rev = new ReverseVowles();
		rev.vowelReverse(str);
	}
	private void vowelReverse(String str) {
		Stack st = new Stack();
		char[]arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 'a'||arr[i] =='i'||arr[i] =='e'||arr[i] =='o'||arr[i] =='u') 
			{
				st.push(arr[i]);	
			}			
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 'a'||arr[i] =='i'||arr[i] =='e'||arr[i] =='o'||arr[i] =='u') 
			{
				arr[i] = (char) st.peek();
				st.pop();
			}			
		}
		System.out.println(arr);	
	}
}
