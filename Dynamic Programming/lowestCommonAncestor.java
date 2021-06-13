public class lowestCommonAncestor {
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
	public lowestCommonAncestor() {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(5);
		root.left = new node(4);
		root.right = new node(6);
		root.left.left = new node(3);
		root.right.right = new node(7);
		root.right.right.right = new node(8);
		int m1 = 7; int m2 = 8;
		System.out.println(checkAncestor(root,m1,m2).key);

	}
	private static node checkAncestor(node root, int m1, int m2) {
		if(root == null || root.key== m1 ||root.key == m2)
		//if root is one of the node,then it will be the lowest common ancestor
			return root;
		node left = checkAncestor(root.left, m1, m2); //gets the node from left-subtree
		node right = checkAncestor(root.right, m1, m2);//gets the node from right-subtree 
		if(left == null && right == null) return null; //if both nodes are null,nodes are not in tree
		if(left !=null && right !=null)return root;// if one node is at left and other is in right
		else
			return (left!=null)?left:right; //else,the one which returns not null will be the lowset ancestor
	}
}
