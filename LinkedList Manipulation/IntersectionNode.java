import java.util.HashSet;

public class IntersectionNode {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	} node head;
	public IntersectionNode() {
		head = null;
	}
	public static void main(String[] args) {
		IntersectionNode obj1 = new IntersectionNode();
		obj1.head = new node(4);
		obj1.head.next = new node(1);
		obj1.head.next.next = new node(8);
		obj1.head.next.next.next = new node(4);
		obj1.head.next.next.next = new node(5);
		IntersectionNode obj2 = new IntersectionNode();
		obj2.head = new node(6);
		obj2.head.next = new node(1);
		obj2.head.next.next = obj1.head.next.next;
		obj2.head.next.next.next = obj1.head.next.next.next;
		System.out.println(getIntersectionNode(obj1.head,obj2.head).data);
	}
	private static node getIntersectionNode(node head1, node head2) {
		HashSet<node>set = new HashSet<node>();
		node temp = head1;
		while(temp!=null) {
			set.add(temp);
			temp = temp.next;
		}
		temp = head2;
		while(temp!=null) {
			if(set.contains(temp))
				return temp;
			set.add(temp);
			temp = temp.next;
		}
		return null;
	}
}