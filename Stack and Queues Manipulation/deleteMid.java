import java.util.Stack;

/*
Given a stack with push(), pop(), empty() operations, 
delete the middle of the stack without using any additional data structure.
Input: 
Stack = {1, 2, 3, 4, 5}
Output:
ModifiedStack = {1, 2, 4, 5}
Explanation:
As the number of elements is 5 , 
hence the middle element will be the 3rd element which is deleted
 */
public class deleteMid {

	public static void main(String[] args) {
		Stack<Integer>stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack);
		deleteMidStack(stack,stack.size(),0);
		System.out.println(stack);
	}
	private static void deleteMidStack(Stack<Integer> stack, int size, int current) {
		if(stack.isEmpty() || current == size)
			return;
		int temp = stack.pop();
		deleteMidStack(stack, size, current+1);
		if(current !=size/2)
			stack.push(temp);	
	}
}
