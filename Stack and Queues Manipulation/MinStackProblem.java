/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
Implement the MinStack class:

MinStack() initializes the stack object.
void push(val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
 */
public class MinStackProblem {
	
	private class Node{
		int data;
		Node next;
	}
	private static Node first  = null;
	static MinStackProblem list = new MinStackProblem();
	

	private void printStack() {
		Node temp;
		temp =first;
		while(temp.next!=null)
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}	
		System.out.println();
	}
	private void push(int i) {
		Node newNode = new Node();
		newNode.data = i;
		newNode.next = first;
		first = newNode;	
		System.out.println(newNode.data +" Pushed");
	}
	private void pop() {
		Node temp = first;
		first = first.next;
		System.out.println("Removed : "+temp.data);
		
		
	}
	private int top() {
		return first.data;
	}
	private void getMin() {
		int minimum = Integer.MAX_VALUE;
		Node temp  = new Node();
		temp = first;
		while(temp.next!=null)
		{
			if(temp.data< minimum)
				minimum = temp.data;
			temp = temp.next;
		}
		System.out.println("Minimum value : "+minimum);
		
	}
	public static void main(String[] args) {
		System.out.println("Stack Manipulation : ");
		list.push(5);
		list.push(3);
		list.push(11);
		list.push(9);
		list.printStack();
		list.pop();
		list.printStack();
		System.out.println("Top : "+list.top());
		list.getMin();
		
	}

}

