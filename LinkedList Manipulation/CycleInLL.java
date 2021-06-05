/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.
Return true if there is a cycle in the linked list. Otherwise, return false
 */
public class CycleInLL {
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	} node head;
	public cycleInLL() {
		head = null;
	}
	public static void main(String[] args) {
		CycleInLL obj = new CycleInLL();
		obj.head = new node(3);
		obj.head.next = new node(2);
		obj.head.next.next = new node(0);
		obj.head.next.next.next = new node(-4);
		obj.head.next.next.next.next = obj.head.next;
		System.out.println(isCycleInLL(obj.head));
	}
	private static boolean isCycleInLL(node head) {
		//recursive
		if(head==null || head.next==null)
			return false;
		if(head.next==head)return true;
		node nextNode = head.next;
		head.next = head;
		boolean isCycle = isCycleInLL(nextNode);
		return isCycle;
	}
}
/* 2-pointer solution
 * if(head==null)
			return false;
		node slow = head;
		node fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				return true;
		}
		return false;
 */
/* with set
 private static boolean isCycleInLL(node head) {
		if(head==null ||head.next==null)
			return false;
		Set<node>set = new HashSet<node>();
		node temp = head;
		while(temp!=null) {
			if(set.contains(temp))
				return true;
			else
				set.add(temp);
			temp=temp.next;
		}
		return false;
	}
*/
