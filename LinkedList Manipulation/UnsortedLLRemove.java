import java.util.HashSet;
import java.util.Set;

/*
 * Write a removeDuplicates() function that takes a list and deletes any duplicate nodes from the list.
 *  The list is not sorted. For example if the linked list is 12->11->12->21->41->43->21 
 *  then removeDuplicates() should convert the list to 12->11->21->41->43. 
 */
public class UnsortedLLRemove {
	static class node{
		int data;
		node next;
		node(int data){
			this.data = data;
			this.next= null;
		}
	}static node root;
	public UnsortedLLRemove() {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(12);
		root.next = new node(11);
		root.next.next = new node(12);
		root.next.next.next = new node(21);
		root.next.next.next.next = new node(41);
		root.next.next.next.next.next = new node(43);
		root.next.next.next.next.next.next = new node(21);
		display(root);
		System.out.println();
		System.out.println("--after--");
		removeDuplicates(root);
	}
	private static void removeDuplicates(node root) {
		Set<Integer>set = new HashSet<Integer>();
		node current = root;
		node previous = null;
		while(current!=null) {
			if(set.contains(current.data)) {
				previous.next = current.next;
			}
			else {
				set.add(current.data);
				previous = current;
			}	
			current = current.next;
		}
		display(root);
	}
	private static void display(node root) {
		while(root!=null) {
			System.out.print(root.data+" ");
			root=root.next;
		}	
	}
}