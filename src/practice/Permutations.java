package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
	int n;
    int k;
    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        List<List<Integer>> result = new LinkedList<>();
        
        ArrayList<Integer> numlist = new ArrayList<Integer>();
        for (int num : nums) numlist.add(num);
       
        permutation(nums, 0, numlist, result);
        
        return result;
    }
    
    private void permutation(int[] nums, int start, ArrayList<Integer> curr, List<List<Integer>> result) {
        if (start == n) result.add(new ArrayList<Integer>(curr)); 
        
        for (int i = start; i < n; ++i) {
            Collections.swap(curr, i, start);
            permutation(nums, start + 1, curr, result);
            Collections.swap(curr, i, start);
        }
    }
}
