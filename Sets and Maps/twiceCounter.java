import java.util.HashMap;
import java.util.Map;
/*
Given a list of N words. Count the number of words that appear exactly twice in the list.
Input:
N = 3
list = {Geeks, For, Geeks}
Output: 1
Explanation: 'Geeks' is the only word that 
appears twice.
Input:
N = 8
list = {Tom, Jerry, Thomas, Tom, Jerry, 
Courage, Tom, Courage}
 */
public class twiceCounter {
	public static void main(String[] args) {
		String [] arr = {"hate","love","peace", "love","peace", "hate","love","peace","love","peace"};
		System.out.println(twiceCount(arr));
	}
	private static int twiceCount(String[] arr) {
		int count = 0;
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], (map.get(arr[i]))+1);
			}
			else
				map.put(arr[i], 1);
		}
		for(Map.Entry entry: map.entrySet()) {
			if((int)entry.getValue() ==2) {
				count++;
			}
		}
		//System.out.println(map);
		return count;
	}
}