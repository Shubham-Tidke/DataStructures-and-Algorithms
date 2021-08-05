/*
 * Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 * 
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */
public class SortedLL_Merge {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	}node head;
	public static void main(String[] args) {
		SortedLL_Merge list1 = new SortedLL_Merge();
		SortedLL_Merge list2 = new SortedLL_Merge();
		list1.head = new node(1);
		list1.head.next = new node(2);
		list1.head.next.next = new node(4);
		
		list2.head = new node(1);
		list2.head.next = new node(3);
		list2.head.next.next = new node(4);
		
		printList(mergeSortedLL(list1.head,list2.head));
	}
	private static node mergeSortedLL(node head1, node head2) {
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
		if(head1.data < head2.data) {
			head1.next = mergeSortedLL(head1.next, head2);
			return head1;
		}
		else {
			head2.next = mergeSortedLL(head1, head2.next);
			return head2;
		}
		
		
	}
	private static void printList(node head) {
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}	
	}
}
