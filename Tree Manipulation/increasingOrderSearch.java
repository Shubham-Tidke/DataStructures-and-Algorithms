import java.util.ArrayList;

/*
 * Given the root of a binary search tree, rearrange the tree in in-order 
 * so that the leftmost node in the tree is now the root of the tree, and 
 * every node has no left child and only one right child.
Example 1:
Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
Example 2:
Input: root = [5,1,7]
Output: [1,null,5,null,7]
 */
public class increasingOrderSearch {
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
	public increasingOrderSearch() {
		root = null;
	}
	static ArrayList<node>list = new ArrayList<node>();
	private static node orderSearch(node root) {
		if(root==null)
			return root;
		addInorder(root);
		for (int i = 0; i < list.size()-1; i++) {
			list.get(i).right = list.get(i+1);
			list.get(i).left = null;
		}
		list.get(list.size()-1).right=null;
        list.get(list.size()-1).left=null;
        return list.get(0);
	}
	private static void addInorder(node root) {
		if(root==null) return;
		addInorder(root.left);
		list.add(root);
		addInorder(root.right);
	}
	public static void main(String[] args) {
		root = new node(5);
		root.left = new node(1);
		root.right = new node(7);
		
		display(orderSearch(root));
	}
	private static void display(node root) {
		if(root!=null) {
			System.out.print(root.val+" ");
			display(root.right);		
		}
		
	}
}