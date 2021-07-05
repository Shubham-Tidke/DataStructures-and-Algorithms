//print the last level first, then the second last level, and so on
public class reverseBFS {
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
	public reverseBFS() {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(10);
		root.left = new node(5);
		root.right = new node(15);
		root.left.left = new node(3);
		root.left.right = new node(7);
		root.right.right = new node(18);
		getReverseBFS(root);
	}
	private static void getReverseBFS(node root) {
		int height = getHeight(root);
		for (int i = height; i >=1; i--) {
			printReverse(root,i);
		}	
	}
	private static void printReverse(node root, int i) {
		if(root==null)
			return;
		if(i==1)
			System.out.println(root.val);
		if(i>1) {
			printReverse(root.left, i-1);
			printReverse(root.right, i-1);
		}
	}
	private static int getHeight(node root) {
		if(root==null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}
}