
public class Reverse_LL {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	} node head;
	public Reverse_LL() {
		head = null;
	}
	public static void main(String[] args) {
		Reverse_LL obj = new Reverse_LL();
		obj.head = new node(3);
		obj.head.next = new node(2);
		obj.head.next.next = new node(0);
		obj.head.next.next.next = new node(-4);
		getReverse(obj.head);
	}
	private static void getReverse(node head) {
		node post = null;
		node prev = null;
		while(head!=null) {
			post = head.next;
			head.next = prev;
			prev = head;
			head = post;
		}
		display(prev);
	}
	private static void display(node head) {
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head= head.next;
		}
		
	}

}
