/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.
Return true if there is a cycle in the linked list. Otherwise, return false
 */
public class CycleInLL {
	class node{
		int data;
		node next;
		int check;
	}
	node head = null;
	public static void main(String[] args) {
		CycleInLL obj = new CycleInLL();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.head.next.next = obj.head;
		System.out.println(obj.detectLoop(obj.head));
	}
	private boolean detectLoop(node head) {
		node temp = head;
		while(temp!= null)
		{
			if(temp.check == 1)//check = 1 means node already visited
				return true;
			temp.check = 1;
			temp = temp.next;
		}
		return false;
	}
	private void push(int i) { //adding at start 
		node newNode = new node();
		newNode.data = i ;
		newNode.next = head;
		newNode.check = 0;
		head = newNode;	
	}

}
