/*
 * Perform level order / breadth first traversal.
 */
public class BFS {
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
	public BFS() {
		root  = null;
	}
	public static void main(String[] args) {
		root = new node(10);
		root.left = new node(20);
		root.right= new node(30);
		root.left.left= new node(40);
		root.left.right= new node(50);
		root.right.left= new node(60);
		root.right.right= new node(70);
		printBFS(root);
	}
	private static void printBFS(node root) {
		int height = findHeight(root);
		for (int i = 0; i < height; i++) {
			printLevel(root,i);
		}	
	}
	private static void printLevel(node root, int i) {
		if(root == null)
			return;
		if(i == 0)
			System.out.print(root.key+" ");
		if(i>0)
		{
			printLevel(root.left,i-1);
			printLevel(root.right,i-1);
		}	
	}
	private static int findHeight(node root) {
		if(root == null)
			return 0;
		return Math.max(findHeight(root.left), findHeight(root.right))+1;
	}
}