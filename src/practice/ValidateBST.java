package practice;

import datastructure.TreeNode;

public class ValidateBST {
	public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }
    
    private boolean isValid(TreeNode root, Integer left, Integer right) {
        if (root == null) return true;
        
        if ((left != null && left >= root.val) || (right != null && right <= root.val)) return false;
        
        return isValid(root.left, left, root.val) && isValid(root.right, root.val, right);
    }
}
