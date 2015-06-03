package com.leetcode.easy;

public class MinStack {
	private Stack stack = null;
	
	public MinStack(){
		this.stack = new Stack();
		this.stack.head = null;
		this.stack.tail = null;
		this.stack.size = 0;
	}
	
	public int size(){
		return this.stack.size;
	}
	
    public void push(int x) {
    	Element newElement = new Element();
    	newElement.value = x;
    	newElement.next = null;
    	newElement.prev = null;
    	if (this.stack.head == null){
    		this.stack.head = newElement;
    		this.stack.tail = newElement;
    		this.stack.tail.currMin = x;
    	}else{
    		this.stack.tail.next = newElement;
    		newElement.prev = this.stack.tail;
    		this.stack.tail = newElement;
    		if (newElement.prev.currMin > x){
    			newElement.currMin = x;
    		}else{
    			newElement.currMin = newElement.prev.currMin;
    		}
    	}
    	
    	this.stack.size++;
    }

    public void pop() {
        if (this.stack.size > 0){
        	this.stack.tail = this.stack.tail.prev;
        	if (this.stack.tail != null){
        		this.stack.tail.next = null;
        	}
        	
        	this.stack.size--;
        	if (this.stack.size == 0){
        		this.stack.head = null;
        	}
        }
    }

    public int top() {
    	if (this.stack.size > 0){
    		return (this.stack.tail.value);
    	}else
    		throw new RuntimeException("There is no element in the stack");
    }

    public int getMin() {
    	if (this.stack.size > 0){
    		return this.stack.tail.currMin;
    	}else
    		throw new RuntimeException("There is no element in the stack");
    }	
	
    class Stack{
    	public int size;
    	public Element head;
    	public Element tail;
    }
    
	class Element{
		public int value;
		public Element next;
		public Element prev;
    	public int currMin;
    	
    	public String toString(){
    		return value + "----" + currMin;
    	}
	}
	
	public static void main(String[] argv){
		MinStack stack = new MinStack();
		stack.push(-2);
		stack.push(0);
		stack.push(-1);
		System.out.println(stack.getMin() + " " + stack.top());
		stack.pop();
		System.out.println(stack.getMin() );
	}
}
