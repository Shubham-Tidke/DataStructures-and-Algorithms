import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
Your task is to implement  2 stacks in one array efficiently.
Example 1:
Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()

Output:
3 4 -1

Explanation:
push1(2) the stack1 will be {2}
push1(3) the stack1 will be {2,3}
push2(4) the stack2 will be {4}
pop1()   the poped element will be 3 
from stack1 and stack1 will be {2}
pop2()   the poped element will be 4 
from stack2 and now stack2 is empty
pop2()   the stack2 is now empty hence -1 .
 */
public class twoStackInArr {
	static Stack<Integer>stack1 = new Stack<Integer>();
	static Stack<Integer>stack2 = new Stack<Integer>();
	static List<Integer>solution = new ArrayList<Integer>();
	public static void main(String[] args) {
		
		stack1.push(2);
		stack1.push(3);
		stack2.push(4);
		pop(stack1,solution);
		pop(stack2,solution);
		pop(stack2,solution);
		System.out.println(Arrays.toString(solution.toArray()));
	}
	public static void pop(Stack<Integer> stack, List<Integer> solution) {
		if(stack.isEmpty())
			solution.add(-1);
		else
			solution.add(stack.pop());
	}
}
