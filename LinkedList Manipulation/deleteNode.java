/*
Write a function to delete a node in a singly-linked list. 
You will not be given access to the head of the list, 
instead you will be given access to the node to be deleted directly.
It is guaranteed that the node to be deleted is not a tail node in the list.
Example 1:

Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5,
the linked list should become 4 -> 1 -> 9 after calling your function.

	public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
 */
public class deleteNode {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	node head;
	public deleteNode() {
		head = null;
	}
	public static void main(String[] args) {
		deleteNode obj = new deleteNode();
		obj.head = new node(4);
		obj.head.next = new node(5);
		obj.head.next.next = new node(1);
		obj.head.next.next.next = new node(9);
		int deleteNode = 4;
		System.out.println("before Delete!");
		display(obj.head);
		System.out.println();
		System.out.println("after Delete!");
		display(deleteElement(obj.head,deleteNode));

	}
	private static node deleteElement(node head, int deleteNode) {
		if(head == null || (head.data == deleteNode && head.next == null))
			return null;
		node temp = head;
		node temp2 = head;
		if(head.data == deleteNode) {
			temp = temp.next;
			head = temp;
			temp2.next=null;
			return head;
		}
		while(temp.next.data!=deleteNode)
			temp=temp.next;
		temp2 = temp.next;
		temp.next = temp.next.next;
		temp2.next = null;
		return head;
	}
	private static void display(node head) {
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		
	}

}
