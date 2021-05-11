/*
 * Perform insertion of a node in a Binary Search Tree
 */
public class Insert_BST {
	 class node{
		int key;
		node left;
		node right;
	}
	node root;
	public Insert_BST() {
		root = null;
	}
	public static void main(String[] args) {
		Insert_BST obj = new Insert_BST();
		obj.insert(10);
		obj.insert(11);
		obj.insert(12);
		obj.insert(13);
		obj.insert(8);
		obj.insert(9);
		obj.insert(7);
		obj.insert(6);
		System.out.println("INORDER TREE : ");
		display(obj.root);
	}
	 static void display(node root) {
		if(root!=null)
		{
			display(root.left);
			System.out.print(root.key + " ");
			display(root.right);
		}
	}	
	private void insert(int i) {
		root = insertionHelper(root,i);		
	}
	private node insertionHelper(node root, int i) {
		if(root  == null)
		{
			root = new node();
			root.key = i;
			return root;
		}
		if(i < root.key)
		{
			root.left = insertionHelper(root.left, i);
		}
		else {
			root.right = insertionHelper(root.right, i);
		}		
		return root;
	}
}