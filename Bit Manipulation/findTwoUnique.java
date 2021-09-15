import java.util.Arrays;
import java.util.HashSet;

/*
Given an array in which all numbers except two are repeated once. (i.e. we have 2n+2 numbers and n numbers
are occurring twice and remaining two have occurred once). Find those two numbers in the most efficient way.
 arr[] = {2, 4, 7, 9, 2, 4}
 output  = 7,9
 */
public class findTwoUnique {
    public static void main(String[] args) {
        int arr[] = {2,4,7,9,2,4};
        System.out.print(Arrays.toString(getTwoUniques(arr)));
    }

    private static int[] getTwoUniques(int[] arr) {
        int res[]  = new int[2];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum^arr[i];//gets XOR of two unique numbers
        }
        sum = sum & -sum; //AND operation with 2's compliment to get rightmost set bit
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] & sum) > 0)
                res[0] = res[0]^arr[i];
            else
                res[1] = res[1]^arr[i];
        }
        return res;
    }
}
