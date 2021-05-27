/*
Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false
 */
public class sameTree {
	static class node{
		int val;
		node left;
		node right;
	public node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
	}node root;
	public sameTree() {
		root = null;
	}
	public static void main(String[] args) {
		sameTree tree1 = new sameTree();
		sameTree tree2 = new sameTree();
		tree1.root = new node(1);
		tree1.root.left = new node(2);
		tree1.root.right = new node(3);
		tree2.root = new node(1);
		tree2.root.left = new node(2);
		tree2.root.right = new node(3);
		System.out.println(checkSameTree(tree1.root,tree2.root));
	}
	private static boolean checkSameTree(node root1, node root2) {
		if(root1==null && root2 == null) {
			return true;
		}
		if(root1!=null && root2!=null)
		return ((root1.val==root2.val)&&(checkSameTree(root1.left, root2.left))&&(checkSameTree(root1.right, root2.right)));
		return false;
	}
}