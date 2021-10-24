package practice;

import datastructure.TreeNode;

public class CheckSubTree {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        
        if(compare(root, subRoot)) return true;
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    private TreeNode meetingPoint(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root; 
        
        TreeNode left = meetingPoint(root.left, val);
        
        if (left != null) return left;
        
        return meetingPoint(root.right, val);
    }
    
    private boolean compare(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)  return true;
        
        if(root == null || subRoot == null ) return false;
        
        return root.val == subRoot.val && compare(root.left, subRoot.left) && compare(root.right, subRoot.right);
    }
}
