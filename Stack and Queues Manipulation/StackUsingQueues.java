import java.util.LinkedList;
import java.util.Queue;

/*
Implement a last in first out (LIFO) stack using only two queues. 
The implemented stack should support all the functions of a normal queue (push, top, pop, and empty).

Implement the MyStack class:

1. void push(int x) Pushes element x to the top of the stack.
2. int pop() Removes the element on the top of the stack and returns it.
3. int top() Returns the element on the top of the stack.
4. boolean empty() Returns true if the stack is empty, false otherwise.

 */
public class StackUsingQueues {
	static Queue<Integer>que1 ;
	static Queue<Integer>que2; 
    public StackUsingQueues()
    {
        que1 = new LinkedList<Integer>();
        que2 = new LinkedList<Integer>();
    }    
	
	public static void main(String[] args) {
		StackUsingQueues st = new StackUsingQueues();
		st.push(10);
		st.push(20);
		st.push(30);
		st.pop();
		st.top();
		st.empty();
	}

	private void top() {
		System.out.println("Top : "+que1.peek());
		
	}

	private void push(int i) {
		if(que1.size() == 0)
		{
			que1.add(i);
			System.out.println(i+" Added to stack");
		}
		else {
			int size = que1.size();
			for (int j = 0; j < size; j++) {
				que2.add(que1.remove());
			}
			que1.add(i);
			for (int j = 0; j < size; j++) {
				que1.add(que2.remove());
			}
			System.out.println(i+" Added to stack");
		}
	}

	private void pop() {
		System.out.println(que1.remove()+" Removed from stack!");
		
	}

	private void empty() {
		if(que1.isEmpty())
			System.out.println("Stack Empty");
		else
			System.out.println("False");
	}

}
