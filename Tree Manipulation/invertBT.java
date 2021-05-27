/*
 * Given the root of a binary tree, invert the tree, and return its root.
Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
Example 2:
Input: root = [2,1,3]
Output: [2,3,1]
Example 3:
 */
public class invertBT {
	static class node{
		int val;
		node left;
		node right;
	public node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
	}static node root;
	public invertBT() {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(10);
		root.left = new node(5);
		root.right = new node(15);
		root.left.left = new node(3);
		root.left.right = new node(7);
		root.right.right = new node(18);
		System.out.println("before:");
		display(root);
		System.out.println();
		System.out.println("after:");
		display(invertTree(root));
	}
	private static void display(node root) {
		if(root!=null) {	
			display(root.left);
			System.out.print(root.val+" ");
			display(root.right);
		}
	}
	private static node invertTree(node root) {
		if(root == null)return null;
		node left = invertTree(root.left);
		node right = invertTree(root.right);
		
		root.left = right;
		root.right = left;
		return root;
	}
}