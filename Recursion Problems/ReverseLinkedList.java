/*
 Given pointer to the head node of a linked list, the task is to reverse the linked list.
We need to reverse the list by changing the links between nodes.

Examples -

1.
Input: Head of following linked list 
1->2->3->4->NULL 
Output: Linked list should be changed to, 
4->3->2->1->NULL

2.
Input: Head of following linked list 
1->2->3->4->5->NULL 
Output: Linked list should be changed to, 
5->4->3->2->1->NULL

3.
Input: NULL 
Output: NULL

4.
Input: 1->NULL 
Output: 1->NULL 
 */
public class ReverseLinkedList {
	class node{
		int data;
		node next;
	}
	static ReverseLinkedList list = new ReverseLinkedList();
	node head = null;
	node tail = null;
	public static void main(String[] args) {
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		node reverse = list.reverseList(list.head);
		display(reverse);
	}
	private static void display(node reverse) { 
		while(reverse!=null) {
			System.out.print(reverse.data + " ");
		reverse = reverse.next;
		}
	}
	private node reverseList(node head) {
		if(head == null)
			return head;
		if(head.next == null)
		{
			return head;
		}
		node Head = reverseList(head.next);
		head.next.next = head;
		head.next = null;	
		return Head;		
	}
	private void push(int i) { 
		node newNode = new node();
		newNode.data = i;
		newNode.next = null;
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
}