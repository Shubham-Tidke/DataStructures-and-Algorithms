import java.util.LinkedList;
/*
Given a non-empty, singly linked list with head node head, return a middle node of linked list.
If there are two middle nodes, return the second middle node.
Example 1:
Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
Example 2:
Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class MiddleOfLL {
	//IF collections used list.size()/2 finds the mid
	class node{
		int data;
		node next;
	}
	node head = null;
	node tail = null;
	public static void main(String[] args) {
		MiddleOfLL list = new MiddleOfLL();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		//list.display();
		System.out.println(list.findMid());
	}
	private int findMid() {
		node first = head;
		node second = head;
		while(first!=null && first.next!=null)
		{
			first = first.next.next;
			second = second.next;
		}
		return second.data;	
	}
	private void display() {
		node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}	
	}
	private void add(int i) {
		node Newnode = new node();
		Newnode.data = i;
		Newnode.next = null;
		if(head == null)
		{
			head = Newnode;
			tail = Newnode;	
		}	
		else
		{
			tail.next =Newnode;
			tail = Newnode;
		}		
	}
}