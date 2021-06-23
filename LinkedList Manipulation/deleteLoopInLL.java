
public class deleteLoopInLL {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	} node head;
	public deleteLoopInLL() {
		head = null;
	}
	public static void main(String[] args) {
		deleteLoopInLL obj = new deleteLoopInLL();
		obj.head = new node(3);
		obj.head.next = new node(2);
		obj.head.next.next = new node(0);
		obj.head.next.next.next = new node(-4);
		obj.head.next.next.next.next = obj.head.next.next;
		getCycleNode(obj.head);
		display(obj.head);
	}
	private static void display(node head) {
		while(head!=null) {
			System.out.println(head.data+" ");
			head=head.next;
		}
	}
	private static void deleteLoop(node slow, node head) {
			node temp1 = slow;
			node temp2 = slow;
			int nodesInLoop = 1;
			//counting nodes in loop
			while(temp1.next!=temp2) {
				temp1 = temp1.next;
				nodesInLoop++;
			}
			temp1 = head;
		
			//temp2 is nodesInLoop away from temp1
			temp2 = head;
			for (int i = 0; i < nodesInLoop; i++) {
				temp2 = temp2.next;
			}
			
			//temp1 temp2 at start of loop
			while(temp1!=temp2) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			
			//temp2 at end of loop
			while(temp2.next!=temp1) {
				temp2 = temp2.next;
			}
			//fixing temp2 pointer
			temp2.next = null;
	}
	
	private static int getCycleNode(node head) {
		node slow = head;
		node fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				deleteLoop(slow,head);
				return 1;
			}
		}
		
		return 0;
	}
}