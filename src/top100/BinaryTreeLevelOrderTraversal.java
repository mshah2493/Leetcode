/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000

Solve iteratively and recursively.
 */

package top100;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal 
{
	public static class TreeNode 
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		 
		TreeNode(int val, TreeNode left, TreeNode right) 
		{
			this.val = val;
			this.left = left;
	 		this.right = right;
		}
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        return list;
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	}
}
