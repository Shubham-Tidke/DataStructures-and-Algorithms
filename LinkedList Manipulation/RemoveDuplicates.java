import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
Return the linked list sorted as well.
example : 1->1->2
output : [1,2]
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		duplicateCheck(list);
	}
	private static void duplicateCheck(LinkedList<Integer> list) {
		HashSet<Integer>set = new HashSet<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if(set.contains(list.get(i)))
				list.remove(i);
			else
				set.add(list.get(i));
		}
		System.out.println(list);
	}
}