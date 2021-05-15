import java.util.Stack;

/*
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *  You may assume the two numbers do not contain any leading zero, except the number 0 itself
 *  eg [2,4,3] + [5,6,4] = [7,0,8]
 */
public class AddingLL {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	} node head;
	public AddingLL(){
		head = null;
	}
	public static void main(String[] args) {
		AddingLL list1 = new AddingLL();
		AddingLL list2 = new AddingLL();
		list1.head = new node(2);
		list1.head.next = new node(4);
		list1.head.next.next = new node(3);
		list2.head = new node(5);
		list2.head.next = new node(6);
		list2.head.next.next = new node(4);
		add(list1.head,list2.head);
	}
	private static void add(node head1, node head2) {
		node newHead = new node(0);
		node list3 = newHead;
		int carry = 0;
		while(head1!=null || head2!= null) {
			int head1_data =(head1!=null)?head1.data:0;
			int head2_data =(head2!=null)?head2.data:0;
			int sum = head1_data+head2_data+carry;
			carry = sum/10;
			int digit = sum%10;
			node newNode = new node(digit);
			list3.next =newNode;
			if(head1!=null)
				head1 = head1.next;
			if(head2!=null)
				head2 = head2.next;
			list3 = list3.next;
		}
		if(carry>0) {
			node newNode = new node(carry);
			list3.next = newNode;
		}
		display(newHead.next);
	}
	private static void display(node temp) {
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
	}
	
}
