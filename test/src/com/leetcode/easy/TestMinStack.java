package com.leetcode.easy;

import junit.framework.TestCase;

public class TestMinStack extends TestCase {
	public void testMinStack() throws Exception{
		MinStack stack = new MinStack();
		
		stack.push(1);
		assertEquals(stack.top(), 1);
		stack.pop();
		assertTrue(stack.size() == 0);
		try{
			stack.getMin();
			fail("Suppose to get exception for empty stack");
		}catch(RuntimeException e){
			
		}
		
		stack.push(2);
		assertTrue(stack.getMin() == 2);
		stack.push(1);;
		assertTrue(stack.getMin() == 1);
		stack.pop();
		assertTrue(stack.getMin() == 2);
		assertTrue(stack.size() == 1);
		stack.pop();
		
		stack.push(-7);
		assertTrue(stack.getMin() == -7);
		stack.push(-5);
		assertTrue(stack.top() == -5);
		stack.push(-3);
		stack.pop();		
	}
}
