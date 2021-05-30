import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue,
leaving the other elements in the same relative order.
Only following standard operations are allowed on queue.
    enqueue(x) : Add an item x to rear of queue
    dequeue() : Remove an item from front of queue
    size() : Returns number of elements in queue.
    front() : Finds front item.
Example 1:
Input:
5 3
1 2 3 4 5
Output: 
3 2 1 4 5
 */
public class revK_elements {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int k = 3;
		System.out.println(Arrays.deepToString(reverseK(arr,k)));
	}
	private static Object[] reverseK(int[] arr, int k) {
		Queue<Integer>q = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			q.add(arr[i]);
		}
		int num = q.size()-k;
		Stack<Integer>stack = new Stack<Integer>();
		while(k-->0) {
			stack.push(q.poll());
		}
		while(!stack.isEmpty()) {
			q.add(stack.pop());
		}
		while(num-->0) {
			q.add(q.poll());
		}
		return q.toArray();
	}

}
