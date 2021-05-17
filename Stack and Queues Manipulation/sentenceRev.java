import java.util.Stack;

/*
reverse the words in a sentence
Example: Let the input string be “i like this program very much”. 
The function should change the string to “much very program this like i”
Input: s = “geeks quiz practice code” 
Output: s = “code practice quiz geeks”
 */
public class sentenceRev {

	public static void main(String[] args) {
		String s = "a good  example";
		System.out.println(revSentence(s));
	}
	private static String revSentence(String s) {
		String[]str = s.split(" +");
		Stack<String>stack = new Stack<String>();
		for(String st:str) {
			stack.push(st);
		}
		String answer = "";
		while(!stack.isEmpty()) {
			answer+=stack.pop()+" ";
		}
		answer = answer.trim();
		return answer;
	}
}