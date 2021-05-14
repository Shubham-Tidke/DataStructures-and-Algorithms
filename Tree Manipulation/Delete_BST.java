/*Delete Nodes in a Binary Search Tree
 * find node->check childs of node->if no child,make it null,
 * ->if only one child,replace the deteltion node with child and make child null
 * ->if both chilren present,take min. of right child and replace the node to be deleted with it,
 * delete the min.of right node after replacement
*/
public class Delete_BST {
	static class node{
		int key;
		node left;
		node right;
		public node(int key) {
			this.key = key;
			this.left = null;
			this.right = null;
		}
	}static node root;
	public  Delete_BST(node root) {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(8);
		root.left=new node(4);
		root.left.left = new node(1);
		root.left.right = new node(7);
		root.right=new node(12);
		root.right.left = new node(9);
		root.right.right = new node(14);
		int value = 12;
		System.out.println("before");
		display(root);
		System.out.println();
		deleteNode(value);
		System.out.println("after");
		display(root);	
	}
	private static void display(node root) {	
		if(root!=null) {
			display(root.left);
			System.out.print(root.key+" ");
			display(root.right);
		}		
	}
	private static void deleteNode(int value) {
		root = deleteHelper(root,value);
	}
	private static node deleteHelper(node root, int value) {
		if(root == null)
			return root;
		else if(root.key<value) {
			root.right = deleteHelper(root.right, value);
		}
		else if(root.key > value) {
			root.left = deleteHelper(root.left, value);
		}
		else {
			//if node to be deleted has no child node
			if(root.left == null && root.right == null) {
				return null;
			}
			//if node to be deleted has right child node
			else if(root.left == null) {
				return root.right;
			}
			//if node to be deleted has left child node
			else if(root.right == null) {
				return root.left;
			}
			//if node to be deleted has both child nodes
			else {
				
				int replaceValue = minimValue(root.right); //gets min value from right child subtree
				root.key = replaceValue;
				root.right = deleteHelper(root.right,replaceValue);
			}
		}
		return root;
	}
	private static int minimValue(node root) {
		int min = root.key;
		while(root.left!=null) {
			min = root.left.key;
			root = root.left;
		}
		return min;
	}
}