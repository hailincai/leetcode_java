package com.leetcode.easy.removelinklist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class SolutionRemoveLinklist {
    public ListNode removeElements(ListNode head, int val) {
    	ListNode prev = head;
    	ListNode curr = head;
    	ListNode newHead = head;
    	while (curr != null){
    		if (curr.val == val){
    			if (prev == curr){
    				newHead = prev.next;
    				prev = curr = newHead;
    			}else{
    				prev.next = curr.next;
    				curr = prev.next;
    			}
    		}else{
    			if (prev == curr){
    				curr = prev.next;
    			}else{
    				prev = curr;
    				curr = curr.next;
    			}
    		}
    	}
    	
    	return newHead;
    }
    
    public static void main(String[] argv){
    	ListNode head = new ListNode(1);
    	new SolutionRemoveLinklist().removeElements(head, 1);
    }
}
