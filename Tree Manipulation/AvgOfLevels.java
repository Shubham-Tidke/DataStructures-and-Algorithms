import java.util.*;
/*
 * Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
 */
public class AvgOfLevels {
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
	public AvgOfLevels(node root) {
		root = null;
	}
	static List<Double>list = new ArrayList<Double>();
	private static void levelAvg(node root) {
		if(root == null)
			return;
		Queue<node>q = new LinkedList<AvgOfLevels.node>();
		q.add(root);
		double level_sum = 0 ;
		double avg_level = 0;
		while(!q.isEmpty())
		{
			level_sum = 0;
			int size = q.size();
			for (int i = 0; i < size; i++) {
				node temp = q.poll();
				level_sum+=temp.data;
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
			}
			avg_level = level_sum/size;
			list.add(avg_level);
		}
		System.out.println(list);
	}
	public static void main(String[] args) {
		root = new node(3);
		root.left = new node(9);
		root.right= new node(20);
		root.right.left= new node(15);
		root.right.right= new node(7);	
		levelAvg(root);
	}	
}