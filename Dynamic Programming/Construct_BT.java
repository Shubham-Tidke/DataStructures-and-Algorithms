/*
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and
 * inorder is the inorder traversal of the same tree, construct and return the binary tree.
Example 1:
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
Example 2:
Input: preorder = [-1], inorder = [-1]
Output: [-1]
*/
public class Construct_BT {
	static class node{
		int data;
		node left;
		node right;
		public node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	static node root;
	public Construct_BT(node root) {
		root = null;
	}
	public static void main(String[] args) {
		int[] inorder = {9,3,15,20,7};
		int[] preorder = {3,9,20,15,7};
		display(getTree(inorder,preorder));
	}
	private static void display(node root) {
		if(root!=null)
		{
			display(root.left);
			System.out.print(root.data+" ");
			display(root.right);
		}
	}
	private static node getTree(int[] inorder, int[] preorder) {
		return helper(0,0,inorder.length-1,inorder,preorder); //helpers to get root of sub-trees
	}
	private static node helper(int preorderStart, int inorderStart, int inorderEnd, int[] inorder, int[] preorder) {
		if(preorderStart>preorder.length-1 || inorderStart > inorderEnd)
			return null;
		node root = new node(preorder[preorderStart]);
		
		int inorderIndex = 0; //to get left and right subtrees
		for (int i = inorderStart; i <= inorderEnd; i++) {
			if(root.data == inorder[i]) {
				inorderIndex = i;	//gets root index of sub-tree in inorder traversal
			}
		}
		root.left = helper(preorderStart+1, inorderStart, inorderIndex-1, inorder, preorder);
		root.right = helper(preorderStart+1+inorderIndex-inorderStart, inorderIndex+1,inorderEnd,inorder, preorder);
		return root;
	}
}