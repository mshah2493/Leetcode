/*
 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
 */


package practice;

import java.util.Stack;

public class MInStack {

	class MinStack {

	    /** initialize your data structure here. */
	    
	    Stack<Integer[]> stack = null;
	    
	    public MinStack() {
	        if (stack == null)
	        {
	            stack = new Stack<Integer[]>();
	        }
	    }
	    
	    public void push(int val) {
	        if (stack.isEmpty())
	        {
	            stack.add(new Integer[]{val, val});
	        }
	        else
	        {
	            stack.add(new Integer[]{val, Math.min(getMin(), val)});    
	        }
	    }
	    
	    public void pop() {
	        stack.pop();
	    }
	    
	    public int top() {
	        return stack.peek()[0];
	    }
	    
	    public int getMin() {
	        return stack.peek()[1];
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
