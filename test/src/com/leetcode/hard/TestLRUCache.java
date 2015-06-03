package com.leetcode.hard;

import junit.framework.TestCase;

public class TestLRUCache extends TestCase {
	public void testCache() throws Exception{
    	LRUCache cache = new LRUCache(1);
    	cache.set(2, 1);
    	assertTrue(cache.get(2) == 1);
    
    	cache.set(1, 1);
    	cache.set(1, 2);
    	assertTrue(cache.get(1) == 2);
    	cache.set(2, 2);
    	assertTrue(cache.get(1) == -1);
    	assertTrue(cache.get(2) == 2);
    	cache.clear();
    	cache = null;
    	
    	cache = new LRUCache(2);
    	cache.set(1, 1);
    	cache.set(2, 2);
    	assertTrue(cache.get(1) == 1);
    	cache.set(3, 3);
    	assertTrue(cache.get(1) == 1);
    	assertTrue(cache.get(3) == 3);		
	}
}
