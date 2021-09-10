import java.util.Arrays;

/*
Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value.
The expected Time Complexity is O(n2).
Examples:
Input : arr[] = {-2, 0, 1, 3}   sum = 2.
Output : 2
Explanation :  Below are triplets with sum less than 2
               (-2, 0, 1) and (-2, 0, 3)

Input : arr[] = {5, 1, 3, 4, 7}   sum = 12.
Output : 4
Explanation :  Below are triplets with sum less than 12
               (1, 3, 4), (1, 3, 5), (1, 3, 7), (1, 4, 5)
 */
public class countTriplets {
    public static void main(String[] args) {
        int arr[] = {5, 1, 3, 4, 7};
        int sum = 12;
        System.out.println(getTriplet(arr,sum));
    }
    private static int getTriplet(int[] arr, int sum) {
        Arrays.sort(arr); //1.3.4.5.7
        int result = 0;
        for (int i = 0; i < arr.length-2; i++) {
            int second = i+1;
            int third = arr.length-1;
            while(second<third){
                if(arr[i]+arr[second]+arr[third] >= sum)
                    third--;
                else{
                    //for current i and second, there can (third-second) possible third elements
                    result +=(third-second);
                    second++;
                }
            }
        }
        return result;
    }
}