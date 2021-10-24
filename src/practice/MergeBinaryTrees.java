/*
You are given two binary trees root1 and root2.

Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.

Return the merged tree.

Note: The merging process must start from the root nodes of both trees.

Example 1:

Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
Output: [3,4,5,5,4,null,7]
Example 2:

Input: root1 = [1], root2 = [1,2]
Output: [2,2]
 
Constraints:

The number of nodes in both trees is in the range [0, 2000].
-104 <= Node.val <= 104

Solve iteratively and recursively.
 */

package practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import java.util.Queue;

public class MergeBinaryTrees 
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
	
	public static List<Integer> levelorderTraversal(TreeNode root) // also called BFS
	{
		if (root == null)
		{
			return null;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);
		list.add(root.val);
		
		while(!queue.isEmpty())
		{
			TreeNode temp = queue.poll();
			
			if (temp.left != null)
			{
				queue.add(temp.left);
				list.add(temp.left.val);
			}
			
			if (temp.right != null)
			{
				queue.add(temp.right);
				list.add(temp.right.val);
			}
		}
		
		return list;
	}
	
	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) 
    {
		return null;
    }
	
	public static void main(String[] args) 
	{
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(3);
		root1.left.left = new TreeNode(5);
		root1.right = new TreeNode(2);
		
		TreeNode root2 = new TreeNode(2);
		root2.left = new TreeNode(1);
		root2.left.right = new TreeNode(4);
		root2.right = new TreeNode(3);
		root2.right.right = new TreeNode(7);
		
		root1 = mergeTrees(root1, root2);
		
		System.out.println(levelorderTraversal(root1));
	}
}