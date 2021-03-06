/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23

Constraints:

1 <= nums.length <= 3 * 104
-105 <= nums[i] <= 105

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

package practice;

public class MaxSubArray 
{
	public static int maxSubArray(int[] nums) 
	{
		int currSum = 0, maxSum = Integer.MIN_VALUE;
		
		for (int num : nums) {
			currSum += num;
			currSum = Math.max(currSum , num);
			maxSum = Math.max(maxSum, currSum);
		}
		
		return maxSum;
	}
	 
	public static void main(String[] args) 
	{
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
}
