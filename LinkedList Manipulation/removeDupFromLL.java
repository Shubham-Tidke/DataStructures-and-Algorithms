/*
 * Write a function that takes a list sorted in non-decreasing order and deletes any duplicate nodes from the list.
 *  The list should only be traversed once. 
For example if the linked list is 11->11->11->21->43->43->60 then
removeDuplicates() should convert the list to 11->21->43->60. 

https://www.geeksforgeeks.org/remove-duplicates-from-a-sorted-linked-list/
 */
public class removeDupFromLL {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	} node head;
	public static void main(String[] args) {
		removeDupFromLL obj = new removeDupFromLL();
		obj.head = new node(11);
		obj.head.next = new node(11);
		obj.head.next.next = new node(11);
		obj.head.next.next.next = new node(21);
		obj.head.next.next.next.next = new node(43);
		obj.head.next.next.next.next.next = new node(43);
		obj.head.next.next.next.next.next.next = new node(60);
		removeDuplicates(obj.head);
		printList(obj.head);
	}
	private static void printList(node head) {
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}	
	}
	private static void removeDuplicates(node head) {	
		 node temp = head;
		while (temp != null)
		{
			node remove = temp;
			while(remove!=null && remove.data==temp.data) {
                remove = remove.next;
            }
			 temp.next = remove;
	            temp = temp.next;
		}	
	}
}