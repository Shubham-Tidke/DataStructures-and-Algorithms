import java.util.Stack;
/*
Given a stack, the task is to sort it such that the top of the stack has the greatest element

Input:
Stack: 3 2 1
Output: 3 2 1

Input:
Stack: 11 2 32 3 41
Output: 41 32 11 3 2
 */
public class stackSort {
	public static void main(String[] args) {
		Stack<Integer>stack = new Stack<Integer>();
		stack.push(11);
		stack.push(2);
		stack.push(32);
		stack.push(3);
		stack.push(41);
		Stack<Integer>solution = sortStack(stack);
		System.out.println(solution.peek());
	}
	private static Stack<Integer> sortStack(Stack<Integer> stack) {
		/*PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
		while(!stack.isEmpty()) {
			pq.add(stack.pop());
		}
		while(!pq.isEmpty()) {
			stack.push(pq.poll());
		}
		System.out.println(stack.pop());*/
		Stack<Integer>TempStack = new Stack<Integer>();
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			while(!TempStack.isEmpty() && TempStack.peek() > temp) {
				stack.push(TempStack.pop());
			}
			TempStack.push(temp);
		}
		return TempStack;
	}
}