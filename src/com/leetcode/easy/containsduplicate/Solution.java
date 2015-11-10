package com.leetcode.easy.containsduplicate;

public class Solution {
    public boolean containsDuplicate1(int[] nums) {
    	if (nums == null) return false;
    	if (nums.length == 1) return false;
    	
        while (true){
            int min = Integer.MAX_VALUE;

            //if have multiple zero, means have duplicate
            int cnt = 0;
            int cntBigThanZero = 0;
            for (int index = 0; index < nums.length; index++){
            	if (nums[index] == 0)
            		cnt ++;
            	if (nums[index] > 0)
            		cntBigThanZero ++;
            	if (cnt >= 2) return true;
            }
            if (cntBigThanZero == 0)
            	break;
            
            //find min value in the list
            for (int index = 0; index < nums.length; index++){
            	int tmp = nums[index];
            	if ((tmp > 0) && (tmp < min)){
            		min = tmp;
            	}
            }
            
            //substract min value 
            for (int index = 0; index < nums.length; index++){
            	nums[index] = nums[index] - min;
            }
        }
        
        return false;
    }
    
    
    public static void main(String[] argv){
    	Solution obj = new Solution();
    	System.out.println(obj.containsDuplicate(new int[]{}));
    	System.out.println(obj.containsDuplicate(new int[]{1}));
    	System.out.println(obj.containsDuplicate(new int[]{1,5,-2,-4,0}));
    	System.out.println(obj.containsDuplicate(new int[]{1,2,2}));
    	System.out.println(obj.containsDuplicate(new int[]{3,2,4,5}));
    	System.out.println(obj.containsDuplicate(new int[]{3,2,4,6}));
    }
}
