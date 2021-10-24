package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import datastructure.TreeNode;

public class PathSumIII {
	public int pathSumNotGood(TreeNode root, int targetSum) {
        if (root == null) return 0;
        
        int pathsFromRoot = preorderNotGood(root, targetSum, 0);
        int pathsOnLeft = pathSumNotGood(root.left, targetSum);
        int pathsOnRight = pathSumNotGood(root.right, targetSum);
        
        return pathsFromRoot + pathsOnLeft + pathsOnRight; 
    }
    
    private int preorderNotGood(TreeNode root, int targetSum, int currSum) {
        if (root == null) return 0;
        
        currSum += root.val;
        
        int count = 0;
        if (targetSum == currSum) 
            ++count;
      
        count += preorderNotGood(root.left, targetSum, currSum);
        count += preorderNotGood(root.right, targetSum, currSum);        
        
        return count;
    }
    
    private int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
    	HashMap<Integer, Integer> map = new HashMap<>(); 	
    	
        preorder(root, targetSum, 0, map);
        
        return count;
    }
    
    private void preorder(TreeNode root, int targetSum, int currSum, HashMap<Integer, Integer> map) {
    	if (root == null) return;
    	
    	currSum += root.val;
    	
    	if (currSum == targetSum) ++count;
    	
    	count += map.getOrDefault(currSum - targetSum, 0);
        
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        
        preorder(root.left, targetSum, currSum, map);
        preorder(root.right, targetSum, currSum, map);
        
        map.put(currSum, map.get(currSum) - 1);
    }
}
