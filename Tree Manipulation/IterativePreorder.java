import java.util.Stack;

public class IterativePreorder {
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
	public IterativePreorder() {
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
		preorder(root);
		
	}
	private static void preorder(node root) {
		if(root == null)
			return;
		Stack<node>stack = new Stack<node>();
		stack.push(root);
		while(!stack.isEmpty()) {
			node temp = stack.pop();
			System.out.println(temp.key);
			if(temp.right!=null)
				stack.push(temp.right);
			if(temp.left!=null)
				stack.push(temp.left);
		}
	}
}
