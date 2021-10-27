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

import datastructure.TreeNode;

public class SymmetricTree 
{	
	public static boolean isSymmetric(TreeNode root) {
        return IsSymmetric(root, root);
    }
    
    private static boolean IsSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        
        if ((left != null && right == null) || (left == null && right != null)) return false;
        
        if (left.val != right.val) return false;
        
        return IsSymmetric(left.left, right.right) && IsSymmetric(left.right, right.left);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
