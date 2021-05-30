import java.util.LinkedList;
import java.util.Queue;

/*
A number is called good if it contains only 1's and 2's.
Given an integer N, the task is to find Nth good number
Note: Some good numbers are 1, 2, 11, 12, 21, 22 ........
Input:
1. The first line of the input contains a single integer T denoting the number of test cases.
 The description of T test cases follows.
2. The first line of each test case contains a single integer N.
Example:
Input:
2
5
10000
Output:
21
1122211121112
 */
public class goodNumbers {
	public static void main(String[] args) {
		int n =10;
		System.out.println(getGoodNum(n));
	}
	private static String getGoodNum(int n) {
		Queue<String>q = new LinkedList<String>();
		q.add("1"); q.add("2");
        for(int i = 1; i < n; i++)
        {
            String temp = q.poll();
          // System.out.println(temp + "1");
           q.add(temp + "1");
          // System.out.println(temp + "2");
            q.add(temp + "2");
        }
      //  System.out.println(q);
        return q.peek();	
	}
}