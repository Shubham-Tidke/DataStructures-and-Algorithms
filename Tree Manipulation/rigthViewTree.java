import java.util.LinkedList;
import java.util.Queue;

public class rigthViewTree {
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
	public rigthViewTree() {
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
		getRightView(root);
	}
	private static void getRightView(node root) {
		if(root == null)
			return;
		Queue<node>queue = new LinkedList<rigthViewTree.node>();
		int level = 1;
		int count = 0;
		queue.add(root);
		while(!queue.isEmpty()) {
			node temp = queue.poll();
			count++;
			if(temp.left!=null)
				queue.add(temp.left);
			if(temp.right!=null)
				queue.add(temp.right);
			if(count==level)
			{
				System.out.println(temp.key);
				level = queue.size();
				count = 0;
			}
			
		}
		
	}
}