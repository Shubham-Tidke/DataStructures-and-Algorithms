/*
Given an integer array nums where the elements are sorted in ascending order,
 convert it to a height-balanced binary search tree.
A height-balanced binary tree is a binary tree in which the depth of the two subtrees 
of every node never differs by more than one.
Example 1:
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:
Example 2:
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,3] and [3,1] are both a height-balanced BSTs.
 */
public class sortedArrToBST {
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
	public sortedArrToBST() {
		root = null;
	}
	public static void main(String[] args) {
		int[]arr = {-10,-3,0,5,9};
		display(getBST(arr));
	}
	private static void display(node root) {
		if(root!=null) {
			display(root.left);
			System.out.print(root.val+" ");
			display(root.right);
		}
	}
	private static node getBST(int[] arr) {
		if(arr.length == 0)return null;
		
		return helper(arr,0,arr.length-1);
	}
	private static node helper(int[] arr, int i, int j) {
		if(i>j)
			return null;
		int mid = i+(j-i)/2;
		node temp = new node(arr[mid]);//root
		temp.left = helper(arr, i, mid-1);
		temp.right = helper(arr, mid+1, j);
		return temp;
	}

}
