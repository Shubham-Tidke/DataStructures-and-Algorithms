/*Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.
eg.root = [1,2,3,4,5] output = 3
 */
public class Diameter_Tree {
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
	public  Diameter_Tree(node root) {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(1);
		//root.left=new node(2);
	//	root.left.left = new node(4);
		//root.left.right = new node(5);
		root.right=new node(3);
		//root.right.left = new node(9);
		//root.right.right = new node(14);
		System.out.println(diameter(root));
	}
	static int max = Integer.MIN_VALUE;
	private static int diameter(node root) {
		int x = helper(root);
		return max;
	}
	private static int helper(node root) {
		if(root == null)
			return 0 ;
		max = Math.max(max, (helper(root.left)+helper(root.right)));	
		return (Math.max(helper(root.left),helper(root.right))+1);
	}

}
