import java.util.Stack;

public class iterativePostorder {
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
	public iterativePostorder() {
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
		postorder(root);
	}
	private static void postorder(node root) {
		Stack<node> first = new<node>Stack();
		Stack<node> second = new<node>Stack();
		if(root==null)
			return;
		first.push(root);
		while(!first.isEmpty()) {
			node temp = first.pop();
			second.push(temp);
			if(temp.left!=null)
				first.push(temp.left);
			if(temp.right!=null)
				first.push(temp.right);
		}
		while(!second.isEmpty()) {
			node temp = second.pop();
			System.out.println(temp.key);
		}
		
	}

}
