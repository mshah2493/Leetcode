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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import datastructure.TreeNode;

public class BinaryTree 
{
	public static List<Integer> inorderTraversal(TreeNode root, List<Integer> list) // also called DFS
	{
		if (root == null)
		{
			return null;
		}
		
		if (list == null)
		{
			list = new ArrayList<>();
		}
		
		inorderTraversal(root.left, list);
		list.add(root.val);
		inorderTraversal(root.right, list);
		
		return list;
	}
	
	public static List<Integer> preorderTraversal(TreeNode root, List<Integer> list) //  also called DFS
	{
		if (root == null)
		{
			return null;
		}
		
		if (list == null)
		{
			list = new ArrayList<>();
		}
		
		list.add(root.val);
		inorderTraversal(root.left, list);
		inorderTraversal(root.right, list);
		
		return list;
	}
	
	public static List<Integer> postorderTraversal(TreeNode root, List<Integer> list) // also called DFS
	{
		if (root == null)
		{
			return null;
		}
		
		if (list == null)
		{
			list = new ArrayList<>();
		}
		
		inorderTraversal(root.left, list);
		inorderTraversal(root.right, list);
		list.add(root.val);
		
		return list;
	}
	
	public static List<Integer> levelorderTraversal(TreeNode root) // also called BFS
	{
		if (root == null)
		{
			return null;
		}
		
		List<Integer> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty())
		{
			list.add(queue.peek().val);
			TreeNode tempNode = queue.remove();
			
			if (tempNode.left != null)
			{
				queue.add(tempNode.left);
			}
			
			if (tempNode.right != null)
			{
				queue.add(tempNode.right);
			}
		}
		
		return list;
	}
	
	public static List<Integer> delete(TreeNode root, int val)
	{
		// TO DO
		
		return levelorderTraversal(root);
	}
	
	public static TreeNode deleteDeepestRightNode(TreeNode root)
	{
		// TO DO
		
		TreeNode deepestRightNode = null;
		
		return deepestRightNode;
	}
	
	public static void main(String[] args) 
	{
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);
		node.right.left = new TreeNode(6);
		node.right.right = new TreeNode(7);
		
		System.out.println(inorderTraversal(node, null));
	}
}
