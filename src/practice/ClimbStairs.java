/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Constraints:

1 <= n <= 45

Implement this 3 ways
1. Recursive method
2. Dynamic Programming
3. Hint - already did it 
*/

package practice;

public class ClimbStairs 
{
	public static int climbStairs(int n) 
    { 
		int first = 0;
        int second = 1;
        int steps = 0;
        
        while (n > 0)
        {
            steps = first + second;
            first = second;
            second = steps;
            --n;
        }
        
        return steps;
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	}
}
