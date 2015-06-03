package com.leetcode.easy.reversebits;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       int retval = 0;
       for (int index = 1; index <= 32; index ++){
    	   retval = (retval << 1) | (n & 0x0001);
    	   n >>= 1;
       }
       
       return retval;
    }
    
	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.reverseBits(1));
	}

}
