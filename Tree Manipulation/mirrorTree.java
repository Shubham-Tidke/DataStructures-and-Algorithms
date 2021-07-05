//Convert a Binary Tree into its Mirror Tree
public class mirrorTree {
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
	public mirrorTree() {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(10);
		root.left = new node(5);
		root.right = new node(15);
		root.left.left = new node(3);
		root.left.right = new node(7);
		root.right.right = new node(18);
		display(root);
		System.out.println();
		System.out.println("Mirror");
		display(getMirror(root));

	}
	private static node getMirror(node root) {
		if(root == null)
			return root;
		node left = getMirror(root.left);
		node right = getMirror(root.right);
		root.left = right;
		root.right = left;
		return root;
	}
	private static void display(node root) {
		if(root!=null) {	
			display(root.left);
			System.out.print(root.val+" ");
			display(root.right);
		}
		
	}

}
