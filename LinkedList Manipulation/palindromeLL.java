import java.util.Stack;

/*
 * Given the head of a singly linked list, return true if it is a palindrome.
 * Input: head = [1,2,2,1]
 * Output: true
 */
public class palindromeLL {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	}node head;
	public static void main(String[] args) {
		palindromeLL list1 = new palindromeLL();
		list1.head = new node(1);
		list1.head.next = new node(2);
		list1.head.next.next = new node(1);
	//	list1.head.next.next.next = new node(1);
		System.out.println(isPalindrome(list1.head));
	}
	private static boolean isPalindrome(node head) {
		node temp = head;
		Stack<Integer>stack = new Stack<Integer>();	
		while(temp!=null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		temp = head;
		while(temp!=null) {
			if(temp.data!=stack.pop())
				return false;	
			temp = temp.next;
		}
		return true;
	}
}