import java.util.LinkedList;

/*
 * Given a link list of size N, modify the list such that all the even numbers appear before all the odd numbers in the modified list. 
 * The order of appearance of numbers within each segregation should be same as that in the original list.
 *
 * N = 7
 * Link List = 17 -> 15 -> 8 -> 9 -> 2 -> 4 -> 6 -> NULL
 * Output: 8 2 4 6 17 15 9
 */
public class SeggEvenOddLL {
	static class node{
		int data;
		node next;
		public node(int data){
			this.data = data;
			this.next = null;
		}
	}static node head;
	public SeggEvenOddLL() {
		head = null;
	}
	public static void main(String[] args) {
		head = new node(17);
		head.next = new node(15);
		head.next.next = new node(8);
		head.next.next.next = new node(9);
		head.next.next.next.next = new node(2);
		head.next.next.next.next.next = new node(4);
		head.next.next.next.next.next.next = new node(6);
		display(head);
		System.out.println();
		getSegregate(head);
	}
	private static void getSegregate(node head) {
		LinkedList<Integer>list = new LinkedList<Integer>();
		node temp = head;
		while(temp!=null)
		{
			if(temp.data%2 == 0)
				list.addLast(temp.data);
			temp = temp.next;
		}
		temp = head;
		while(temp!=null)
		{
			if(temp.data%2 != 0)
				list.addLast(temp.data);
			temp = temp.next;
		}
		System.out.println(list);
	}
	private static void display(node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}