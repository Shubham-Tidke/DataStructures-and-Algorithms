import java.util.HashSet;
import java.util.LinkedList;

/*
Given two linked lists, your task is to complete the function makeUnion(), 
that returns the union of two linked lists. This union should include all the distinct elements only.
Expected Time Complexity: O(N * Log(N))
Expected Auxiliary Space: O(N)
Example 1:

Input:
L1 = 9->6->4->2->3->8
L2 = 1->2->8->6->2
Output: 1 2 3 4 6 8 9
 */
public class unionOfTwoLL {
	public static void main(String[] args) {
		LinkedList<Integer>list1 = new LinkedList<Integer>();
		LinkedList<Integer>list2 = new LinkedList<Integer>();
		list1.add(9);
		list1.add(6);
		list1.add(4);
		list1.add(2);
		list1.add(3);
		list1.add(8);
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(6);
		list2.add(2);
		Union(list1,list2);
	}
	private static void Union(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		HashSet<Integer>set = new HashSet<Integer>();
		for (int i = 0; i < list1.size(); i++) {
			set.add(list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			set.add(list2.get(i));
		}
		System.out.println(set);
	}	
}