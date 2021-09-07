/*
Inversion Count for an array indicates – how far (or close) the array is from being sorted. If the array is already sorted,
then the inversion count is 0, but if the array is sorted in the reverse order, the inversion count is the maximum.
Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j
Example:
Input: arr[] = {8, 4, 2, 1}
Output: 6
Explanation: Given array has six inversions:
(8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).
Input: arr[] = {3, 1, 2}
Output: 2
Explanation: Given array has two inversions:
(3, 1), (3, 2)
* */
import java.util.*;
public class countInversion {
    public static void main(String[] args) {
        int[]arr = {8, 4, 2, 1};
        System.out.print(getInverisonCount(arr,0,arr.length-1));
    }
    public static int getInverisonCount(int[]arr,int left,int right){
        int count = 0;
        if(left<right){
            int mid = (left+right)/2;
            count+=getInverisonCount(arr,left,mid);
            count+=getInverisonCount(arr,mid+1,right);
            count+=mergeAndCount(arr,left,right,mid);
        }
        return count;
    }

    //function to count number of merges required
    public static int mergeAndCount(int[]arr,int left,int right,int mid){
        int leftSubArr[] = Arrays.copyOfRange(arr,left,mid+1);
        int rightSubArr[] = Arrays.copyOfRange(arr,mid+1,right+1);
        int i = 0, j = 0, k = left, swaps = 0;
        while (i < leftSubArr.length && j < rightSubArr.length)
        {
            if (leftSubArr[i] <= rightSubArr[j])
                arr[k++] = leftSubArr[i++];
            else {
                arr[k++] = rightSubArr[j++];
                swaps += (mid + 1) - (left + i);
            }
        }
        while(i<leftSubArr.length)
            arr[k++]=leftSubArr[i++];
        while(j<rightSubArr.length)
            arr[k++]=rightSubArr[j++];

        return swaps;
    }
}