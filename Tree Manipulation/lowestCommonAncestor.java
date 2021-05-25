/*
Given a Binary Search Tree (with all values unique) and two node values. 
Find the Lowest Common Ancestors of the two nodes in the BST.

Input:
              5
           /    \
         4       6
        /         \
       3           7
                    \
                     8
n1 = 7, n2 = 8
Output: 7
 */
public class lowestCommonAncestor {
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
	public lowestCommonAncestor() {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(5);
		root.left = new node(4);
		root.right = new node(6);
		root.left.left = new node(3);
		root.right.right = new node(7);
		root.right.right.right = new node(8);
		int m1 = 7; int m2 = 8;
		System.out.println(findAncestor(root,m1,m2).key);
	}
	private static node findAncestor(node root, int m1, int m2) {
			if(m1<root.key && m2<root.key) {
				//System.out.println(root.key);
				return findAncestor(root.left, m1, m2);
			}			
			if(m1>root.key && m2>root.key) {
				//System.out.println(root.key);
				return findAncestor(root.right, m1, m2);
			}
		return root;
	}
}