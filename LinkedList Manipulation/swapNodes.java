/*
 *Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
eg. 1->2->3->4 = 2->1->4->3
 */
public class swapNodes {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	}static node head;
	public swapNodes(){
		head = null;
	}
	public static void main(String[] args) {
		head = new node(1);
		head.next = new node(2);
		head.next.next = new node(3);
		head.next.next.next = new node(4);
		swap(head);
	}
	private static void swap(node head) {
		node temp = new node(0);
		temp.next = head;
		node current = temp;
		while(current.next!=null && current.next.next !=null) {
			node temp1 = current.next ;
			node temp2 = current.next.next;
			temp1.next = temp2.next;
			temp2.next = temp1;
			current.next = temp2;
			current.next.next = temp1;
			current = current.next.next;
		}
		display(temp.next);
	}
	private static void display(node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}	
	}
}