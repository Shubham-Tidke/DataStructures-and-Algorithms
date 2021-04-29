import java.util.Stack;

/*
Implement a first in first out (FIFO) queue using only two stacks.
The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
 */
public class queueUsingStack {

	Stack<Integer>s1 = new Stack<Integer>();
	Stack<Integer>s2 = new Stack<Integer>();
	public static void main(String[] args) {
		queueUsingStack que = new queueUsingStack();
		que.push(10);
		que.push(20);
		que.push(30);
		que.pop();
		que.peek();
		que.empty();
	}
	private void push(int i) {
		if(s1.isEmpty()) // if s1 is empty,get new element in s1
		{
			s1.push(i);
			System.out.println(i+" added");
		}
			
		else {				// else add all elements of s1 to s2,and then add new element in s1 ,add s2 elements to s1 again.
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			s1.push(i);
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
			System.out.println(i+" added");
		}
	}
	private void pop() {	
		System.out.println(s1.peek()+" removed");
		s1.pop();
	}
	private void peek() {
		System.out.println("Top : "+s1.peek());		
	}
	private void empty() {
		if(s2.isEmpty()) {
			System.out.println("true");
		}
		System.out.println("false");		
	}
}
