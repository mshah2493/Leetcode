/*
 
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
Constraints:

n == nums.length
1 <= n <= 5 * 104
-231 <= nums[i] <= 231 - 1
 
Follow-up: Could you solve the problem in linear time and in O(1) space?
 
 */

package practice;

import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorElement = nums[0];
        
        for (int num : nums)
        {
            if (map.containsKey(num))
            {
                map.put(num, map.get(num) + 1);
            }
            else
            {
                map.put(num, 1);
            }
            
            if (map.get(majorElement) < map.get(num))
            {
                majorElement = num;
            }
        }
        
        return majorElement;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
