import java.util.Arrays;

/*
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
  (you may want to display this pattern in a fixed font for better legibility)
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);
Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
P   A   H   N
A P L S I I G
Y   I   R
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I 
 */
public class zigZag {
	public static void main(String[] args) {
		String str = "PAYPALISHIRING";
		int rows = 3;
		zigzagPrint(str,rows);
	}
	private static void zigzagPrint(String str, int rows) {
		if(rows == 1 || rows == 0)
			System.out.println(str);
		String[]arr = new String[rows];//to store characters row wise
		Arrays.fill(arr, "");
		int num = 0;
		boolean down = true;
		for (int i = 0; i < str.length(); i++) {
			arr[num]+= str.charAt(i);
			if(num == rows-1)// if we are at last row,no need to go down
			{
				down = false;
			}
			else if(num == 0) //if at top row,need to down
			{
				down = true;
			}
			if(down == true)//increasing num to go down in rows
				num++;
			else		// decreasing num while coming up in rows
				num--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}		
	}
}