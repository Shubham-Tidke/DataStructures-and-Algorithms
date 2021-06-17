/*
Example 1:
Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()
Output:
3 4 -1
Explanation:
push1(2) the stack1 will be {2}
push1(3) the stack1 will be {2,3}
push2(4) the stack2 will be {4}
pop1()   the poped element will be 3 
from stack1 and stack1 will be {2}
pop2()   the poped element will be 4 
from stack2 and now stack2 is empty
pop2()   the stack2 is now empty hence -1 .
 */
public class twoStackInArr {
	static int[]solution ;
	int size;
	int top1,top2;
	public twoStackInArr(int n) {
		size = n;
		solution = new int[n];
		top1 = n/2 + 1;
		top2 = n/2;
	}
	public static void main(String[] args) {
		
		twoStackInArr obj = new twoStackInArr(3);
		obj.push1(2);
		obj.push1(3);
		obj.push2(4);
		System.out.println(obj.pop1());
		System.out.println(obj.pop2());
		System.out.println(obj.pop2());

}
	private int pop1() {
		if(top1<=size/2) {
			int temp = solution[top1];
			top1++;
			return temp;
		}
		else
		{
			System.out.print("-1");
			System.exit(1);
		}
		return 0;
	}
	private int pop2() {
		if(top2>=size/2+1) {
			int temp = solution[top2];
			top2--;
			return temp;
		}
		else
		{
			System.out.print("-1");
			System.exit(1);
		}
		return 0;
	}
	private void push2(int i) {
		if(top2<(size-1)) {
			top2++;
			solution[top2] = i;
		}
		else {
			System.out.println("stack 2 overflow!!");
			return;
		}	
	}
	private void push1(int i) {
		if(top1>0) {
			top1--;
			solution[top1] = i;
		}
		else {
			System.out.println("stack 1 overflow!!");
			return;
		}
	}	
}