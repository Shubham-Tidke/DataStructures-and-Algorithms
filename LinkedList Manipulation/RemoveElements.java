/*
Given the head of a linked list and an integer val, 
remove all the nodes of the linked list that has - 
Node.val == val, and return the new head.
eg.input = 1->2->3>4->5->6 value = 3
output = 1->2->4->5->6
 */
public class RemoveElements {
	class node{
		int data;
		node next;
	}
	node head = null;
	node tail = null;
	public static void main(String[] args) {
		RemoveElements obj = new RemoveElements();
		int value = 1;
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.remove(value);
		obj.display();
	}
	private void display() {
		node temp = head;
		while(temp!= null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}	
	}
	private void remove(int value) {
		node temp = head;
		node prev = null;
		if(temp.data == value) //if head needs to be removed!
		{
			temp = temp.next;
			head = temp;
		}
		while(temp!=null )//anything else than head to be removed!
		{	
			if(temp.data == value)
				prev.next = temp.next;
			prev = temp;
			temp = temp.next;	
		}		
	}
	private void add(int i) {
		node newNode = new node();
		newNode.data = i;
		newNode.next = null;
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
}