/*
 Perform 
1. Pre order
2. In order
3. Post order
traversals for a binary tree recursively
 */
public class RecursiveDFS {
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
	public RecursiveDFS(){
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
		System.out.println("--PRE-ORDER--");
		preorder(root);
		System.out.println();
		System.out.println("--POST-ORDER--");
		postorder(root);
		System.out.println();
		System.out.println("--INORDER--");
		inorder(root);	
	}
	//root->left->right
	private static void preorder(node root) {
		if (root == null)
            return;
			System.out.print(root.key+" ");
			preorder(root.left);
			preorder(root.right);
	}
	//left->right>root
	private static void postorder(node root) {
		if (root == null)
            return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key+" ");		
	}
	//left->root->right
	private static void inorder(node root) {
		if (root == null)
            return;
		inorder(root.left);
		System.out.print(root.key+" ");
		inorder(root.right);
	}
}