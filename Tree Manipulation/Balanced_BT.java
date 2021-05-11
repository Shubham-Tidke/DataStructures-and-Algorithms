/*
Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
eg root =[3,9,20,null,null,15,7] output:true
 */
public class Balanced_BT {
	static class node{
		public node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
		int key;
		node left;
		node right;
	}
	static node root;
	public Balanced_BT(node root) {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(3);
		root.left = new node(9);
		root.right = new node(20);
		root.right.left = new node(15);
		root.right.right = new node(7);
		System.out.println(isBalanced(root));
	}
	private static boolean isBalanced(node root) {
		if(root == null)
		return true;
		int left = height(root.left);
		int right = height(root.right);
		if(Math.abs(right-left)<=1 && isBalanced(root.left) && isBalanced(root.right))
			return true;
		return false;
	}
	private static int height(node temp) {
		if(temp == null)
			return 0;
		
		return 1+Math.max(height(temp.left), height(temp.right));
	}
}