/*
 * Create a BST..Perform search operations
 */
public class Search_BST {
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
	static node root;
	public Search_BST() {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(10);
		root.left =new node(8);
		root.left.left = new node(6);
		root.left.right = new node(9);
		root.right = new node(12);
		root.right.left = new node(11);
		root.right.right = new node(13);
		int value = 11;
		if(Search(root,value) != null) {
			System.out.println(value+" Found");
		}
		else {
			System.out.println(value+" is not in BST");
		}
	}
	private static node Search(node root, int value) {
		if(root == null || root.key == value)
			return root;
		if(value < root.key)
		{
			return Search(root.left, value);
		}	
		return Search(root.right, value) ;
		
	}
}