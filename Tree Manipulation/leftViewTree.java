public class leftViewTree {
	static int max_level = 0;
	public static class node{
		int key;
		node left;
		node right;	
		public node(int key) {
			this.key = key;
			this.left = null;
			this.right = null;
		}
	}
	static node root ;
	public leftViewTree() {
		root =null;
	}
	public static void main(String[] args) {
		root = new node(10);
		root.left = new node(20);
		root.right= new node(30);
		root.left.left= new node(40);
		root.left.right= new node(50);
		root.right.left= new node(60);
		root.right.right= new node(70);
		getLeftView(root);
	}
	//Performing level order traversal and print the first node of every level
	private static void getLeftView(node root) {
		helper(root,1);
	}
	private static void helper(node root, int level) {
		if(root == null)
			return;
		
		if(max_level < level) {
			System.out.println(root.key);
			max_level = level;
		}
		helper(root.left, level+1);
		helper(root.right, level+1);
		
	}
}