package com.leetcode.hard;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LRUCache {
    private Map<Integer, Integer> cache;
    private Stack<Integer> keyStack;
    private int capacity;
    
    private void putKey2End(Integer cacheKey){
   		keyStack.remove(cacheKey);
   		keyStack.push(cacheKey);
    }
    
    public LRUCache(int capacity) {
    	this.cache = new HashMap<Integer, Integer>(capacity);
    	keyStack = new Stack<Integer>();
    	this.capacity = capacity;
    }
    
    public int get(int key) {
    	Integer cacheKey = new Integer(key);
    	if (cache.containsKey(cacheKey)){
    		int retVal = cache.get(cacheKey).intValue();
    		putKey2End(cacheKey);
    		return retVal;
    	}else{
    		return -1;
    	}
    }
    
    public void set(int key, int value) {
        if (this.cache.size() >= this.capacity){
        	Integer cacheKey = keyStack.get(0);
        	keyStack.remove(cacheKey);
        	cache.remove(cacheKey);
        }
        
        Integer cacheKey = new Integer(key);
        this.cache.put(new Integer(key), new Integer(value));
        //need to put the new key into the last element
        putKey2End(cacheKey);
    }
    
    public void clear(){
    	this.cache.clear();
    }
}