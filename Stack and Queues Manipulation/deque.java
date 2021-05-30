import java.util.Arrays;

/*
A deque is a double-ended queue that allows enqueue and dequeue operations from both the ends.
Given a deque and Q queries. The task is to perform some operation on dequeue according to the queries as given below:
1. pb: query to push back the element x.
2. pf: query to push element x(given with query) to the front of the deque.
3. pp_b(): query to delete element from the back of the deque.
4. f: query to return a front element from the deque.

Example 1:

Input:
5
pf 5
pf 10
pb 6
f
pp_b

Output: 
10
 */
public class deque {
	static int arr[] = new int[100];
	int front =-1;
	int rear = 0;
	int size;
	
	public deque(int size) {
		this.size = size;
	}
	public static void main(String[] args) {
		deque dq = new deque(5);
		dq.pushFront(5);
		dq.pushFront(10);
		dq.pushRear(6);
		System.out.println(dq.front()+" at peek from front!");
		dq.popBack();
	}
	private boolean isFull() {
		if(front==0 && rear == size-1 ||front == rear+1)
			return true;
		return false;
	}
	private boolean isEmpty() {
		if(front == -1)
			return true;
		return false;
	}
	
	private void pushFront(int i) {
		if(isFull()) {
			System.out.println("Overflow!");
			return;
		}
		if(front==-1)//first element in deque
		{
			front =0;
			rear =0;			
		}else if(front==0)//2nd element in deque
			front = size-1;
		else		//for all other elements
			front = front-1;
		arr[front] = i;
		System.out.println(i+" added at start");
	}
	private void pushRear(int i) {
		if(isFull()) {
			System.out.println("Overflow!");
			return;
		}
		if(front==-1)//first element in deque
		{
			front =0;
			rear =0;			
		}else if(rear==size-1)
			rear = 0;
		else		
			rear = rear+1;
		arr[rear] = i;
			
		System.out.println(i+" added at last");
		
	}
	private int front() {
		if(isEmpty()) {
			System.out.println("Nothing at top!");
			return -1;
		}
		return arr[front];
		
	}
	private void popBack() {
		if(isEmpty()) {
			System.out.println("Nothing to pop!");
			return;
		}
		if(front == rear){//deque with only 1 element
		System.out.println(arr[rear]+" popped!");
			front = -1;
			rear = -1;
		}else if(rear==0) {
		System.out.println(arr[rear]+" popped!");
			rear = size-1;
		}
		else {
			System.out.println(arr[rear]+" popped!");
			rear = rear-1;
		}
			
	}
}