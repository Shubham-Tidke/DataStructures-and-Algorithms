/*
You are given two binary trees root1 and root2.
Imagine that when you put one of them to cover the other, 
some nodes of the two trees are overlapped while the others are not. 
You need to merge the two trees into a new binary tree. 
The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. 
Otherwise, the NOT null node will be used as the node of the new tree.
Return the merged tree.

Note: The merging process must start from the root nodes of both trees.
eg. root1 =[1,3,2,5] root2=[2,1,3,null,4,null,7] => [3 4 5 5 4 null 7]
 */
public class MergeTwoTrees {
	 static class node{
		int key;
		node left;
		node right;
		public node(int key) {
			this.key = key;
			this.left = null;
			this.right = null;
		}
	} node root;
	public  MergeTwoTrees() {
		root = null;
	}
	public static void main(String[] args) {
		MergeTwoTrees tree1 = new MergeTwoTrees();
		MergeTwoTrees tree2 = new MergeTwoTrees();
		tree1.root = new node(1);
		tree1.root.left = new node(3);
		tree1.root.right = new node(2);
		tree1.root.left.left = new node(5);
		tree2.root = new node(2);
		tree2.root.left = new node(1);
		tree2.root.right = new node(3);
		tree2.root.left.right = new node(4);
		tree2.root.right.right = new node(7);
		display(merge(tree1.root,tree2.root));	
	}
	private static void display(node root) {
		if(root!=null)
		{
			display(root.left);
			System.out.print(root.key+" ");
			display(root.right);
		}
	}
	private static node merge(node root1, node root2) {
		if(root1 == null)
			return root2;
		if(root2 == null)
			return root1;
		root1.key +=root2.key;
		root1.left = merge(root1.left,root2.left);
		root1.right = merge(root1.right,root2.right);
		return root1;
	}
}