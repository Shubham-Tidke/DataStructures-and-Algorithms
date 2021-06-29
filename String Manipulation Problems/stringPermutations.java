/*
 * A permutation, also called an “arrangement number” or “order,” 
 * is a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself.
A string of length n has n! permutation. 

Below are the permutations of string ABC. 
ABC ACB BAC BCA CBA CAB
 */
public class stringPermutations {

	public static void main(String[] args) {
		String str = "ABC";
		getPermutations(str," ");
	}
	private static void getPermutations(String str, String solution) {
		if(str.length() == 0) {
			System.out.println(solution+" ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			String left = str.substring(0,i);
			String right = str.substring(i+1);
			String rem = left+right;
			getPermutations(rem, solution+str.charAt(i));
		}	
	}
}