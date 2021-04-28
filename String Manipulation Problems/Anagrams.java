/*
Problem Statement -

Write a function to check whether two given strings are anagram of each other or not. 
An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
For example, 
	“abcd” and “dabc” are an anagram of each other.
	“DOG” and “GOD” are an anagram of each other.

 */
import java.util.Scanner;
public  class Anagrams {
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("First String : ");
		String str1 = sc.nextLine();
		System.out.println("Second String : ");
		String str2 = sc.nextLine();
		Anagrams a = new Anagrams();
		boolean result = a.anagramCheck(str1,str2);
		if(result == true)
		{
			System.out.println("Strings are Anagrams!");
		}
		else
			System.out.println("Strings are not Anagrams!");
	}
	private boolean anagramCheck(String str1, String str2) {
		int arr[] = new int[122];
		int flag = 0;		
		for (int i = 0; i < str1.length(); i++) {
			arr[(int)str1.charAt(i)]++;
			arr[(int)str2.charAt(i)]--;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
			{
				return false;
			}
		}
		return true;
	}
}
