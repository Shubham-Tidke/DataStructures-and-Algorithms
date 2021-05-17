import java.util.ArrayList;
import java.util.List;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:
Input: n = 1
Output: ["()"]
 */
public class generateParanthesis {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(generateParenthesis(n));
	}
	  static List<String> resp;
	    public static List<String> generateParenthesis(int n) {
	        resp = new ArrayList<>();
	        generateParenthesis("", n, n);
	        return resp;
	    }
	     public static void generateParenthesis(String op, int open, int close) {
	         if(open ==0 && close ==0){
	             resp.add(op);
	             return;
	         }
	         if(open>0){
	             String op1 = op+"(";
	             int nextOpen= open-1;
	             generateParenthesis(op1,nextOpen,close );
	         }
	         if(open<close){
	             String op2=op+")";
	              int nextClose= close-1;
	             generateParenthesis(op2, open,nextClose);
	         }
	    }	 
}


