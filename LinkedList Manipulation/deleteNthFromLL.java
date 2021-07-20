/*
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * 
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 */
public class deleteNthFromLL {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	node head;
	public deleteNthFromLL() {
		head = null;
	}
	public static void main(String[] args) {
		deleteNthFromLL obj = new deleteNthFromLL();
		obj.head = new node(1);
		obj.head.next = new node(2);
		obj.head.next.next = new node(3);
		obj.head.next.next.next = new node(4);
		obj.head.next.next.next.next = new node(5);
		int delete = 2;
		deleteFromEnd(obj.head,delete);
	}
	private static void deleteFromEnd(node head, int delete) {
		node temp = head;
		int count =0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		if(count == 1 && delete == 1)
			return;
		temp = head;
		while(count-- > delete+1) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		display(head);
	}
	private static void display(node head) {
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		
	}

}
/* get the fast pointer n times ahead of slow and traverse till null
 *  public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode fast = start;
        ListNode slow = start;
        slow.next = head;
        for(int i = 1;i<=n+1 ; i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
        return start.next;
    }
    
    */
