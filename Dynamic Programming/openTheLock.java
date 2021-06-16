import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/*
You have a lock in front of you with 4 circular wheels.
Each wheel has 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. 
The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'.
Each move consists of turning one wheel one slot.The lock initially starts at '0000',
a string representing the state of the 4 wheels.You are given a list of deadends dead ends,
meaning if the lock displays any of these codes,the wheels of the lock will stop turning and you will be unable to open it.
Given a target representing the value of the wheels that will unlock the lock,
return the minimum total number of turns required to open the lock, or -1 if it is impossible.

Example 1:

Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
Output: 6
Explanation:
A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
because the wheels of the lock become stuck after the display becomes the dead end "0102".

Example 2:

Input: deadends = ["8888"], target = "0009"
Output: 1
Explanation:
We can turn the last wheel in reverse to move from "0000" -> "0009".

Example 3:

Input: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
Output: -1
Explanation:
We can't reach the target without getting stuck.
 */
public class openTheLock {

	public static void main(String[] args) {
		String[]deadends = {"0201","0101","0102","1212","2002"};
		String target = "0202";
		System.out.println(openLock(deadends,target));
	}
	private static int openLock(String[] deadends, String target) {
		HashSet<String>dead_ends = new HashSet<String>(Arrays.asList(deadends));
		HashSet<String>visited_code = new HashSet<String>();
		Queue<String>moves = new LinkedList<String>();
		visited_code.add("0000");	//starting node in visited set
		moves.offer("0000");		//starting node in moves
		
		int level = 0;
		while(!moves.isEmpty()) {
			int size = moves.size();
			while(size>0) {
				String currentLockPosition = moves.poll();
				if(dead_ends.contains(currentLockPosition)) {	//check for deadend string
					size--;
					continue;
				}
				if(currentLockPosition.equals(target))
					return level;
				//logic
				StringBuilder sb = new StringBuilder(currentLockPosition);
				for (int i = 0; i < 4; i++) {
					char currentPos = sb.charAt(i);
					String nextPossibleForward = sb.substring(0,i)+(currentPos == '9'?0:currentPos-'0'+1)+sb.substring(i+1);
					//possible move by antiClockwise rotation
					String nextPossibleBackward= sb.substring(0,i)+(currentPos == '0'?9:currentPos-'0'-1)+sb.substring(i+1);
					//possible rotation by clockwise rotation
					if(!visited_code.contains(nextPossibleForward)&&!dead_ends.contains(nextPossibleForward)) {
						moves.offer(nextPossibleForward);
						visited_code.add(nextPossibleForward);
					}
					if(!visited_code.contains(nextPossibleBackward)&&!dead_ends.contains(nextPossibleBackward)) {
						moves.offer(nextPossibleBackward);
						visited_code.add(nextPossibleBackward);
					}
				}
				size--;
			}
			level++;
		}
		
		return -1;
	}

}
