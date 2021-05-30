import java.util.Deque;
import java.util.LinkedList;

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
	static Deque<Integer>dq = new LinkedList<Integer>();
	public static void main(String[] args) {
		pf(5);
		pf(10);
		pb(6);
		System.out.println(front()+" at peek from front!");
		popBack();
	}
	private static void pf(int i) {
		dq.addFirst(i);
		System.out.println(i+" added at start");
		System.out.println(dq);
	}
	private static void pb(int i) {
		dq.addLast(i);
		System.out.println(i+" added at last");
		System.out.println(dq);
	}
	private static int front() {
		return dq.peekFirst();
	}
	private static void popBack() {
		System.out.println(dq.pollLast()+" removed!");
		System.out.println(dq);
	}
}