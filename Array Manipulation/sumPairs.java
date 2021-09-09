import java.util.HashMap;

/*
Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.
Input  :  arr[] = {1, 5, 7, -1}, sum = 6
Output :  2
Pairs with sum 6 are (1, 5) and (7, -1)
Input  :  arr[] = {1, 5, 7, -1, 5}, sum = 6
Output :  3
Pairs with sum 6 are (1, 5), (7, -1) & (1, 5)
 */
public class sumPairs {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1};
        int sum = 2;
        System.out.println(countSumPairs(arr,sum));
    }
    private static int countSumPairs(int[] arr, int sum) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i]))
                map.put(arr[i],0);
            map.put(arr[i],map.get(arr[i])+1);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(map.get(sum-arr[i])!=null){
                count +=map.get(sum-arr[i]);
                if(sum-arr[i] == arr[i])
                    count--;
            }
        }
        return count/2;
    }
}
