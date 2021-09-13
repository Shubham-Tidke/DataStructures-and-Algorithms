/*
Given an array, print all subarrays in the array which has sum 0.
Examples:
Input:  arr = [6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7]
Output:
Subarray found from Index 2 to 4
Subarray found from Index 2 to 6
Subarray found from Index 5 to 6
Subarray found from Index 6 to 9
Subarray found from Index 0 to 10
 */
public class ZeroSumSubArr {
    public static void main(String[] args) {
        int arr[] = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        getZeroSum(arr);
    }
    private static void getZeroSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for ( int j = i+1; j < arr.length; j++) {
                sum+=arr[j];
                if(sum==0)
                    System.out.println("Zero sum subarray : "+ i +" to "+j);
            }
        }
    }
}
