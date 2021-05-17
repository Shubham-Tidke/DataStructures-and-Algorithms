import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
You are given two integer arrays nums1 and nums2 both of unique elements, where nums1 is a subset of nums2.
Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. 
If it does not exist, return -1 for this number.
Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation:
For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
For number 1 in the first array, the next greater number for it in the second array is 3.
For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 */
public class nextGreater {

	public static void main(String[] args) {
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};	
		System.out.println(Arrays.toString(greater(nums1,nums2)));
	}

	private static int[] greater(int[] nums1, int[] nums2) {
		 HashMap<Integer,Integer> hm = new HashMap<>();
	        for(int i=0;i<nums2.length;i++)
	        {
	            hm.put(nums2[i],i);
	        }
	        int arr[] = new int[nums1.length];
	        for(int j=0;j<nums1.length;j++)
	        {   
	            boolean flag = false;
	            int start = hm.get(nums1[j]);
	            for(int k=start;k<nums2.length;k++)
	            {
	                if(nums2[k] > nums1[j])
	                {
	                    arr[j] = nums2[k];
	                    flag = true;
	                    break;
	                }
	            }
	            if(!flag)
	                arr[j] = -1;
	        }
	        return arr;	}

}
