import java.util.Stack;

/*
You are given an array A of size N. 
You need to first push the elements of the array into a stack 
and then print minimum in the stack at each pop.
Input:
N = 5
A = {1 2 3 4 5}
Output: 
1 1 1 1 1
N = 7
A = {1 6 43 1 2 0 5}
 */
public class getMinAtPop {
static Stack<Integer>stack  = new Stack<Integer>();
	public static void main(String[] args) {
		int arr[] = {1, 34, 23, 17, 37, 42, 13, 39, 0, 53, 49, 6, 71};
		getMin(arr);
	}
	private static void getMin(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			 if(stack.isEmpty() || stack.peek()>arr[i])
	                stack.push(arr[i]);
			 else
				 stack.push(stack.peek());
		}           		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}	
	}
}
