package practice;

import java.util.ArrayList;
import java.util.List;

import datastructure.TreeNode;

public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> nodes = new ArrayList<>();
        
        pathSum(root, targetSum, paths, nodes);
        
        return paths;
    }
    
    private void pathSum(TreeNode root, int targetSum, List<List<Integer>> paths, List<Integer> nodes) {
        if (root == null) return;
        
        nodes.add(root.val);
        
        if (root.left == null && root.right == null && targetSum == root.val) 
            paths.add(new ArrayList<>(nodes));
        else {
            pathSum(root.left, targetSum - root.val, paths, nodes);
            pathSum(root.right, targetSum - root.val, paths, nodes);
        }        
        
        nodes.remove(nodes.size() - 1);
    }
}
