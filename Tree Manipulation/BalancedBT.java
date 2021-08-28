/*
 * Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
Input: root = [3,9,20,null,null,15,7]
Output: true
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
.
 */
public class BalancedBT{
	 public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int lh=height(root.left);
        int rh=height(root.right);
    	return (Math.abs(lh-rh)<=1  && isBalanced(root.left) && isBalanced(root.right));       
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

}
