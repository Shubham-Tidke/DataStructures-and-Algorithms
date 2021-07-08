import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
    0 <= a, b, c, d < n
    a, b, c, and d are distinct.
    nums[a] + nums[b] + nums[c] + nums[d] == target
    
    Input: nums = [1,0,-1,0,-2,2], target = 0
	Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

 */
public class fourSum {

	public static void main(String[] args) {
		int [] nums = {2,2,2,2};
		int target = 8;
		System.out.println(getFourSum(nums,target));
	}
	private static List<List<Integer>> getFourSum(int[] nums, int target) {
		Arrays.sort(nums);
		Set<List<Integer>>solution = new HashSet<List<Integer>>();
		for (int i = 0; i < nums.length-3; i++) {
			for (int j = i+1; j < nums.length-2; j++) {
				int left = j+1;
				int right=nums.length-1;
				while(left<right) {
					int sum = nums[i]+nums[j]+nums[left]+nums[right];
					if(sum==target)
						solution.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
					if(sum>target)right--;
					if(sum<=target)left++;
				}
			}
		}
		return solution.stream().collect(Collectors.toList());
	}
}