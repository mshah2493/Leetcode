package practice;

import datastructure.TreeNode;

public class BinaryTreePaths {
	public static TreeNode sortedArrayToBST(int[] nums) {
	    if (nums == null || nums.length == 0) return null;
	    
	    return createBST(nums, 0, nums.length - 1);
	}
	
	private static TreeNode createBST(int[] nums, int start, int end) {
		if (end < start) return null;
		
		int mid = start + (end - start) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = createBST(nums, start, mid - 1);
		node.right = createBST(nums, mid + 1, end);
		
		return node;
	}
}