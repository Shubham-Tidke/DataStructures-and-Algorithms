import java.util.LinkedList;
import java.util.Queue;
/*
 * Given a binary tree and a key, insert the key into the binary tree at the first position available in level order.
 * eg:
 * Inorder traversal before insertion: 7 11 10 15 9 8 
 * key: 12
 * Inorder traversal after insertion: 7 11 12 10 15 9 8
 */
public class BT_Insert {

	public static class node{
		int key;
		node left;
		node right;
		public node(int key) {
			this.key = key;
		}
	}
	static node root;
	public BT_Insert() {
		node root = null;
	}
	public static void main(String[] args) {
		
		root = new node(10);
		root.left = new node(11);
		root.left.left= new node(7);
		root.right= new node(9);
		root.right.left= new node(15);
		root.right.right= new node(8);
		int key = 12;
		insert(root,key);
		display(root);
	}
	private static void display(node root) {
		if(root!=null)
		{
			display(root.left);
			System.out.print(root.key+" ");
			display(root.right);
		}
	}
	private static void insert(node root, int i) {
		
		if(root == null)
			root = new node(i);
		Queue<node>q = new LinkedList<node>();
		q.add(root);
		while(!q.isEmpty())
		{
			node temp = q.peek();
			q.remove();
			if(temp.left==null) {
				temp.left = new node(i);
				return;
			}
			else
				if(temp.right==null) {
					temp.right = new node(i);
					return;
				}	
			else {
				q.add(temp.left);
				q.add(temp.right);
			}
				
		}
	}
}