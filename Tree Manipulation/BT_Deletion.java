import java.util.LinkedList;
import java.util.Queue;

/*Given a binary tree, delete a node from it
 * by making sure that tree shrinks from the bottom
 * (i.e. the deleted node is replaced by bottom most and rightmost node)
 * eg: Inorder traversal before deletion : 7 11 12 10 15 9 8 
 * node deleted: 11
 * Inorder traversal after deletion : 7 8 12 10 15 9 
 */
public class BT_Deletion {
	public static class node{
		int key;
		node left;
		node right;
		public node(int key) {
			this.key = key;
		}
	}
	static node root;
	public BT_Deletion() {
		node root = null;
	}
	public static void main(String[] args) {
		root = new node(10);
		root.left = new node(11);
		root.left.left= new node(7);
		root.left.right = new node(12);
		root.right= new node(9);
		root.right.left= new node(15);
		root.right.right= new node(8);
		int key = 11;
		display(root);
		System.out.println();
		deleteNode(root,key);
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
	private static void deleteNode(node root, int data) {
		if(root==null)
			return ;
		if(root.left ==null && root.right ==null )
		{
			if(root.key==data) {
				deleteNode(root, data);
				root =null;
				return ;
			}
		}	
		Queue<node>q = new LinkedList<node>();
		q.add(root);
		node data_node = null;
		node last_node = null;
		while(!q.isEmpty()) {
			last_node = q.poll();
			if(last_node.key == data)
				data_node = last_node;
			if(last_node.left != null)
				q.add(last_node.left);
			if(last_node.right!=null)
				q.add(last_node.right);
		}
		if(data_node != null)
		{
			data_node.key = last_node.key;
			deleteLastNode(root,last_node);
		}
	}
	private static void deleteLastNode(node root, node last) {
		if(root == null)
		{
			return;
		}
		if(root == last)
		{
			root = null;
			return;
		}
		if(root.left==last) {
			root.left = null;
			return;
		}
		if(root.right== last) {
			root.right= null;
			return;
		}
		deleteLastNode(root.left, last);
		deleteLastNode(root.right, last);
	}
}