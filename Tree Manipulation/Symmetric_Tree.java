//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
//eg root = [1,2,2,3,4,4,3] output- true, root = [1,2,2,null,3,null,3] - false
public class Symmetric_Tree {
	 static class node{
			int key;
			node left;
			node right;
			public node(int key) {
				this.key = key;
				this.left = null;
				this.right = null;
			}
		} static node root;
		public  Symmetric_Tree() {
			root = null;
		}
	public static void main(String[] args) {
		root =new node(1);
		root.left = new node(2);
		root.right = new node(2);
		root.left.left = new node(3);
		root.left.right = new node(4);
		root.right.left = new node(4);
		root.right.right = new node(3);
		System.out.println(isSymmetric(root));
	}
	private static boolean isSymmetric(node root) {	
		return(isMirror(root,root)); //considering left subtree and right subtree as 2 separate trees		
	}
	//check if left subtree is mirror of right subtree
	private static boolean isMirror(node root1, node root2) {
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null)
			return false;
		return (root1.key == root2.key)&& isMirror(root1.left, root2.right)&& isMirror(root1.right, root2.left);
	}
}