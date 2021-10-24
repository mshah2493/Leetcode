package practice;

import java.util.HashMap;

public class PathSumIIIArray {
    public static int pathSum(int[] nums, int targetSum) {
    	int count = 0, currSum = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        
        for (int num : nums) {
            // current prefix sum
            currSum += num;
            
            // situation 1:  
            // continuous sub array starts 
            // from the beginning of the array
            if (currSum == targetSum)
                count++;
            
            // situation 2:
            // number of times the curr_sum − k has occurred already, 
            // determines the number of times a sub array with sum k 
            // has occurred up to the current index
            count += h.getOrDefault(currSum - targetSum, 0);
            
            // add the current sum
            h.put(currSum, h.getOrDefault(currSum, 0) + 1);    
        }
                
        return count;
    }
    
    public static void main(String[] args) {
    	int[] nums = { 3, 4, 1, 6, -3, 10, 0 };
    	int target = 7;
    	
    	System.out.print(pathSum(nums, target));
    }
}
