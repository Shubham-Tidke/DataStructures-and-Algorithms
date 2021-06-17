/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, 
where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
Input: board = [["A","B","C","E"],
				["S","F","C","S"],
				["A","D","E","E"]], 
word = "SEE"
Output: true
 */
public class wordSearch {
	static boolean [][]visited ;
	public static void main(String[] args) {
		char[][]arr = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "SEE";
		System.out.println(getWord(arr,word));
	}
	private static boolean getWord(char[][] arr, String word) {
		visited = new boolean[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(word.charAt(0) == arr[i][j] && searchWord(i,j,0,word,arr))
					return true;
			}
		}
		return false;
	}
	private static boolean searchWord(int i, int j, int index, String word, char[][] arr) {
		if(index == word.length()) return true;
		
		if(i<0 ||i>=arr.length || j<0 || j>=arr[i].length || word.charAt(index)!=arr[i][j] ||visited[i][j])
			return false;
		
		visited[i][j] = true;
		if(
			searchWord(i+1, j, index+1, word, arr) ||
			searchWord(i, j+1, index+1, word, arr) ||
			searchWord(i-1, j, index+1, word, arr) ||
			searchWord(i, j-1, index+1, word, arr))
			return true;
		
		visited[i][j] = false;
		return false;
	}
}