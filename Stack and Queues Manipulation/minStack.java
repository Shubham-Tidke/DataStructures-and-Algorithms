import java.util.Stack;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
Implement the MinStack class:

    MinStack() initializes the stack object.
    void push(val) pushes the element val onto the stack.
    void pop() removes the element on the top of the stack.
    int top() gets the top element of the stack.
    int getMin() retrieves the minimum element in the stack.
 */
public class minStack {
		Stack<Integer>stack;
		int minimum;
		public minStack() {
			stack = new Stack<Integer>();
	}
	public static void main(String[] args) {
		minStack obj = new minStack();
		obj.push(3);
		obj.push(5);
		System.out.println(obj.min()+" current minimum!");
		obj.push(2);
		obj.push(1);
		System.out.println(obj.min()+" current minimum!");
		obj.pop();
		System.out.println(obj.min()+" current minimum!");
		System.out.println(obj.top()+" at top!");
	}
	private void push(int i) {
		if(stack.isEmpty()) {
			stack.push(i);
			minimum = i;
		}else if(minimum>i){
			stack.push(2*i-minimum);
			minimum = i;
		}else {
			stack.push(i);
		}	
	}
	private void pop() {
		if(stack.isEmpty()) {
			System.out.println("nothing to pop!");
			return;
		}
		else {
			int temp = stack.pop();
			if(temp<minimum) {
				System.out.println(minimum+" popped!");
				minimum = 2*minimum-temp;
			}
			else System.out.println(temp+" popped!");
		}
	}
	private int top() {	
		return (minimum < stack.peek())?stack.peek():minimum;
	}
	private int min() {
		return minimum;
	}
}