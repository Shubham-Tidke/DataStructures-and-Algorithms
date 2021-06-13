import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of distinct integers, return all the possible permutations.
You can return the answer in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]
 */
public class permutations {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		System.out.println(getPermutations(arr));
	}

	private static List<List<Integer>> getPermutations(int[] arr) {
		List<List<Integer>>result = new ArrayList<List<Integer>>();
		boolean[]visited = new boolean[arr.length];
		backtrack(result,visited,arr,new ArrayList());
		return result;
	}

	private static void backtrack(List<List<Integer>> result, boolean[] visited, int[] arr, List<Integer> current) {
		if(current.size() == arr.length)
		{
			result.add(new ArrayList<Integer>(current));
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if(visited[i] == true)
				continue;
			current.add(arr[i]);	//number not visited,add in set
			visited[i] = true;		//mark added num true
			backtrack(result, visited, arr, current); //add remainig non visited to set
			current.remove(current.size()-1);
			visited[i] = false;
		}
	}

}
