/*
 Construct Binary Tree from given Parent Array representation
 	
 Given an array that represents a tree in such a way that array indexes are values in tree nodes and array values give the parent node of that particular index (or node). 
 The value of the root node index would always be -1 as there is no parent for root. 
 Construct the standard linked representation of given Binary Tree from this given representation.
 
 Input: parent[] = {1, 5, 5, 2, 2, -1, 3}
Output: root of below tree
          5
        /  \
       1    2
      /    / \
     0    3   4
         /
        6 
Explanation: 
Index of -1 is 5.  So 5 is root.  
5 is present at indexes 1 and 2.  So 1 and 2 are
children of 5.  
1 is present at index 0, so 0 is child of 1.
2 is present at indexes 3 and 4.  So 3 and 4 are
children of 2.  
3 is present at index 6, so 6 is child of 3.


Input: parent[] = {-1, 0, 0, 1, 1, 3, 5};
Output: root of below tree
         0
       /   \
      1     2
     / \
    3   4
   /
  5 
 /
6
*/

package practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import datastructure.TreeNode;

public class BTreeUsingArray 
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
		preorderTraversal(root.left, list);
		preorderTraversal(root.right, list);
		
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
		
		postorderTraversal(root.left, list);
		postorderTraversal(root.right, list);
		list.add(root.val);
		
		return list;
	}
	
	public static List<Integer> levelorderTraversal(TreeNode root, List<Integer> list) // also called BFS
	{
		if (root == null)
		{
			return null;
		}
		
		if (list == null)
		{
			list = new ArrayList<>();
		}
		
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
	
	public static TreeNode getTree(int[] array) 
	{
		int arrVal; 
		
		TreeNode root = null; 
		
		TreeNode[] tree = new TreeNode[array.length];
		
		for (int arrIndex = 0; arrIndex < array.length; ++arrIndex)
		{
			arrVal = array[arrIndex];
			
			if (tree[arrIndex] == null)
			{
				tree[arrIndex] = new TreeNode(arrIndex);
			}
			
			if (arrVal == -1)
			{
				root = tree[arrIndex];
			}
			else
			{
				if (tree[arrVal] == null)
				{
					tree[arrVal] = new TreeNode(arrVal);
				}
				
				if (tree[arrVal].left == null)
				{
					tree[arrVal].left = tree[arrIndex];
				}
				else
				{
					tree[arrVal].right = tree[arrIndex];
				}
			}
		}
		
		return root == null ? null : root;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int  tree[] = new int[]{1, 5, 5, 2, 2, -1, 3};
		int tree2[] = {-1, 0, 0, 1, 1, 3, 5};
		
		TreeNode rootTree = getTree(tree);
		TreeNode rootTree2 = getTree(tree2);
		
		System.out.println("=========inorderTraversal=========");
		System.out.println(inorderTraversal(rootTree, null));
		System.out.println(inorderTraversal(rootTree2, null));
		
		System.out.println("=========preorderTraversal=========");
		System.out.println(preorderTraversal(rootTree, null));
		System.out.println(preorderTraversal(rootTree2, null));
		
		System.out.println("=========postorderTraversal=========");
		System.out.println(postorderTraversal(rootTree, null));
		System.out.println(postorderTraversal(rootTree2, null));
		
		System.out.println("=========levelorderTraversal=========");
		System.out.println(levelorderTraversal(rootTree, null));
		System.out.println(levelorderTraversal(rootTree2, null));
	}
}
