/*
Given an array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number.
Return the indices of the two numbers (1-indexed) as an integer array answer of size 2,
where 1 <= answer[0] < answer[1] <= numbers.length.
The tests are generated such that there is exactly one solution. You may not use the same element twice.

Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

Example 2:
Input: numbers = [2,3,4], target = 6
Output: [1,3]
 */
import java.util.*;
public class twoSum_II{
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.print(Arrays.toString(twoSum(numbers,target)));
    }
    public static int[] twoSum(int [] numbers,int target){
        int left = 0, right = numbers.length - 1;
        int currentSum = 0;
        int[] ans = new int[]{0,0};
        while (left < right) {
            currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                ans[0] = left + 1; // adding 1 because index in answers is +1 array index
                ans[1] = right + 1;
                return ans;
            }
            if (currentSum < target) {
                left++; // move left pointer
            } else {
                right--; // move right pointer
            }
        }
        return ans;
    }
}