//root = [1,2,3,4,5] output = 3
/*the diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.
 */
public class treeDiameter {
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
	static class solution{
		int result = 0;
	}
	public static void main(String[] args) {
		root = new node(1);
		root.left = new node(2);
		root.right = new node(3);
		root.left.left = new node(4);
		root.left.right = new node(5);
		System.out.println(getDiameter(root));
	}
	private static int getDiameter(node root) {
		solution obj = new solution();
		helper(root,obj);
		return obj.result;
	}
	private static int helper(node root, solution obj) {
		if(root == null) {
			return 0;
		}
		int left = helper(root.left, obj);
		int right = helper(root.right, obj);
		obj.result =Math.max(obj.result, left+right);
		return 1+Math.max(left, right);	
	}
}
