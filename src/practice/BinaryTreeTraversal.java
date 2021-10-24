/*
 Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:

Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
Example 4:

Input: root = [1,2]
Output: [2,1]
Example 5:

Input: root = [1,null,2]
Output: [1,2]
 
Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 
Follow up: Recursive solution is trivial, could you do it iteratively?

 */

package practice;

import java.util.List;

public class BinaryTreeTraversal 
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
	
	public static List<Integer> inorderTraversal(TreeNode root) // also called DFS
	{	
		return null;
	}
	
	public static List<Integer> preorderTraversal(TreeNode root) //  also called DFS
	{
		return null;
	}
	
	public static List<Integer> postorderTraversal(TreeNode root) // also called DFS
	{	
		return null;
	}
	
	public static List<Integer> levelorderTraversal(TreeNode root) // also called BFS
	{
		return null;
	}
	
	public static List<Integer> delete(TreeNode root, int val)
	{
		return null;
	}
	
	public static TreeNode deleteDeepestRightNode(TreeNode root)
	{
		return null;
	}
	
	public static void main(String[] args) 
	{
	}
}
