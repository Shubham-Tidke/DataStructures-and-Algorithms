import java.util.Stack;

/*
 * Given the root node of a binary search tree and two integers low and high, 
 * return the sum of values of all nodes with a value in the inclusive range [low, high].
Example 1:
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
Example 2:
Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
 */
public class rangeSumBST {
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
	public rangeSumBST() {
		root = null;
	}
	public static void main(String[] args) {
		root = new node(10);
		root.left = new node(5);
		root.right = new node(15);
		root.left.left = new node(3);
		root.left.right = new node(7);
		root.right.right = new node(18);
		int low = 7;int high = 15;
		System.out.println((getRangeSum(root,low,high)));	
	}
	private static int getRangeSum(node root, int low, int high) {
		int sum = low+high;
		Stack<node>stack = new Stack<node>();
		stack.push(root);
		while(!stack.isEmpty()) {
			node temp = stack.pop();
            if(temp!=null){
				if(temp.val>low && temp.val<high) {
					sum+=temp.val;
				}
				if(temp.val>low) {
					stack.push(temp.left);
				}
				if(temp.val<high) {
					stack.push(temp.right);
				}
            }
		}
		return sum;
	}
}