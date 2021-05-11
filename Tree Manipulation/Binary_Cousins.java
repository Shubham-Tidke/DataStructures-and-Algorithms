/*
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
Return true if and only if the nodes corresponding to the values x and y are cousins.
root:[1,2,3,4](preorder),x=4,y=3 output- false
root:[1,2,3,null,4,null,5],x=5,y=4 output-true
 */
public class Binary_Cousins {
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
		public Binary_Cousins() {
			root = null;
		}
	public static void main(String[] args) {
			root = new node(1);
			root.left = new node(2);
			root.right = new node(3);
			root.left.left = new node(4);
			root.right.right = new node(5);
			node x = new node(5);
			node y = new node(4);
			System.out.println(checkCousins(root,x,y));
	}
	private static boolean checkCousins(node root, node x, node y) {
		if(root == null || x == null || y == null)
			return false;
		if(nodeHeight(root,x.key,1)!= nodeHeight(root,y.key,1))
			return false;
		return !isSiblings(root,x,y); //if siblings,then can't be cousins
	}
	private static boolean isSiblings(node root, node x, node y) {
		if(root == null)
		{
			return false;
		}
		return (root.left == x && root.right == y)
				||(root.left == x && root.right == y)
				||(isSiblings(root.left, x, y))
				||(isSiblings(root.right, x, y));
		
	}
	private static int nodeHeight(node root, int val, int height) {
		if(root ==null) {
			return 0;
		}
		if(root.key == val )
			return height;
		int l = nodeHeight(root.left, val, height+1);
		if(l!=0)
			return l;
		l = nodeHeight(root.right, val, height+1);
		
		return l;	
	}
}