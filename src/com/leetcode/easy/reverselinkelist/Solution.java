package com.leetcode.easy.reverselinkelist;

public class Solution {
    public ListNode reverseList(ListNode head) {
    	if (head == null)
    		return null;
    	
    	if (head.next == null){
    		return head;
    	}
    	
    	ListNode newHead = null;
    	while (head != null){
    		ListNode tmp = head.next;
    		head.next = newHead;
    		newHead = head;
    		head = tmp;
    	}
    	
    	return newHead;
    }
    
    public static void main(String[] args){
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	node1.next = node2;
    	
    	ListNode newNode = new Solution().reverseList(node1);
    	System.out.println(newNode);
    }
}
