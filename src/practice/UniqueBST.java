package practice;

import java.util.ArrayList;
import java.util.List;

public class UniqueBST {
	public int numTrees(int n) {
		int[] G = new int[n + 1];
		G[0] = 1;
		G[1] = 1;

		for (int i = 2; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				G[i] += G[j - 1] * G[i - j];
			}
		}

		return G[n];
	}
	
	public List<TreeNode> generateTrees(int n) {
        return generateBST(1, n);
    }
    
    private List<TreeNode> generateBST(int start, int end) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        
        if (start > end) {
            list.add(null);
            
            return list;
        }
        
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = generateBST(start, i - 1);
            List<TreeNode> right = generateBST(i + 1, end);
            
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode node = new TreeNode(i);
                    node.left = l;
                    node.right = r;
                    
                    list.add(node);
                }
            }
         }
        
        return list;
    }
}
