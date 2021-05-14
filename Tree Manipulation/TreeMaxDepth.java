/*
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along 
the longest path from the root node down to the farthest leaf node.
eg.root = [3,9,20,null,null,15,7] = 3
	root = [1,null,2] = 2
*/
public class TreeMaxDepth {
	static class node{
		int key;
		node left;
		node right;
		public node(int key) {
			this.key = key;
			this.left = null;
			this.right = null;
		}
	}static node root;
	public TreeMaxDepth() {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(3);
		root.left=new node(9);
		root.right=new node(20);
		root.right.left = new node(15);
		root.right.right = new node(7);
		System.out.println(maxDepth(root));
	}
	private static int maxDepth(node root) {
		if(root == null)
			return 0 ;
		return 1+Math.max(maxDepth(root.right), maxDepth(root.left));
	}
}
