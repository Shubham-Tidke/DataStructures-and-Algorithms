import java.util.Stack;

/*
 * void push(int x) Pushes element x to the back of the queue.
	int pop() Removes the element from the front of the queue and returns it.
	int peek() Returns the element at the front of the queue.
	boolean empty() Returns true if the queue is empty, false otherwise.
 */
public class queUsingStack {
Stack<Integer> stack1 = new Stack<Integer>();
Stack<Integer> stack2 = new Stack<Integer>();
int peekVal = 0;
	public static void main(String[] args) {
		queUsingStack que = new queUsingStack();
		que.push(10);
		que.push(20);
		//que.push(30);
		//que.push(40);
		//que.push(50);
		que.pop();
		que.peek();
		
		System.out.println(que.empty());
	}
	private void push(int i) {
		stack1.push(i);
		if(stack1.size() == 1)
			peekVal = i;
	}
	private void pop() {
		while(stack1.size()>1)
		{
			peekVal = stack1.peek();
			stack2.push(stack1.pop());
		}
		System.out.println(stack1.pop()+" Popped out");
		while(stack2.size()>0)
			stack1.push(stack2.pop());	
	}
	private void peek() {
			System.out.println(peekVal+" at top!");
	}

	private boolean empty() {
		if(!stack1.isEmpty())
			return false;
		else
			return true;
		
	}

}
