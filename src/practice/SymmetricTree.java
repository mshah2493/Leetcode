/*
Given a binary tree, check whether it is a mirror of itself.

For example, this binary tree is symmetric: 

     1
   /   \
  2     2
 / \   / \
3   4 4   3

But the following is not:
    1
   / \
  2   2
   \   \
   3    3
   
 Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
 

Follow up: Could you solve it both recursively and iteratively?
 */

package practice;

public class SymmetricTree 
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
	
	public boolean isSymmetric(TreeNode root) 
	{
		return false;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	}
}
