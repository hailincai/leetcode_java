package com.leetcode.easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null)
          return 0;
        
        boolean[] flag = new boolean[nums.length];
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        int retVal = nums.length;
        int validCount = 0;
        for (int index = 0; index < nums.length; index++){
            if (nums[index] == val){
                flag[index] = false;
                retVal --;
            }else{
            	flag[index] = true;
            	validCount ++;
            }
        }
        
        
        int outputIdx = 0;
        for (int index = 0; index < flag.length; index++){
        	if (flag[index]){
        		nums[outputIdx] = copy[index];
        		outputIdx ++;
        	}
        }
        
        return retVal;
      }
    
    public static void main(String[] args){
    	RemoveElement obj = new RemoveElement();
    	int[] input = new int[]{4,5};
    	System.out.println(obj.removeElement(input, 4));
    	System.out.println(input);
    }
}
