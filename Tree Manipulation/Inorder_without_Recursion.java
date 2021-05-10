import java.util.Stack;

//Print inorder traversal of binary tree but without recursion
public class Inorder_without_Recursion {
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
	public Inorder_without_Recursion() {
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
		inorder(root);
	}
	//left->root->right
	private static void inorder(node root) {
		if(root == null)
			return;
		Stack<node>st = new Stack<node>();
		while(true) {
			if(root!=null)
			{
				st.push(root);
				root = root.left;
			}
			else {
				if(st.isEmpty())
					break;
			root = st.pop();
			System.out.print(root.key+" ");
			root = root.right;
			}
		}
	}
}