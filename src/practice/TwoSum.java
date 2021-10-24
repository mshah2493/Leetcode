/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/

package practice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum 
{
	
	public static int[] twoSum(int[] nums, int target) 
	{
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		int index = 0;
		
		for (int num : nums) {
			if (map.containsKey(target - num)) {
				result[0] = map.get(target - num);
				result[1] = index;
				
				break;
			} 
			
			map.put(num, index);
			
			++index;
		}
		
		return result;
	}

	public static void main(String[] args) 
	{
		int[] nums = {2,7,11,15};
		int target = 20;
		
		System.out.print(Arrays.toString(twoSum(nums, target)));
	}
}
