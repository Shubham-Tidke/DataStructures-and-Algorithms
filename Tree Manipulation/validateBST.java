/*
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * Input: root = [2,1,3]
 * Output: true
 * 
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 */
public class validateBST {
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
	public validateBST() {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(2);
		root.left=new node(1);
		root.right=new node(20);
		System.out.println(isBST(root));
	}
	private static boolean isBST(node root) {
		return helper(root,null,null);
	}
	private static boolean helper(node root, node leftNode, node rightNode) {
		if(root == null)return true;
		if(leftNode!=null && root.key<=leftNode.key)
			return false;
		if(rightNode!=null && root.key>=rightNode.key)
			return false;
		
		return helper(root.left, leftNode, root) && helper(root.right, root, rightNode);
	}

}
