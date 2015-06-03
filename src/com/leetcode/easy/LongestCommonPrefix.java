package com.leetcode.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	if ((strs == null) || (strs.length == 0))
    		return "";
    	
    	if (strs.length == 1)
    		return strs[0];
    	
    	String retVal = "";
    	char[] firstString = strs[0].toCharArray();
    	for (int index = 0; index < firstString.length; index++){
    		char compareChar = firstString[index];
    		
    		boolean canAppend = true;
    		for (int index1 = 1; index1 < strs.length; index1++){
    			String targetStr = strs[index1];
    			if ((index > (targetStr.length() - 1)) ||
    					(targetStr.charAt(index) != compareChar)){
    				canAppend = false;
    				break;
    			}
    		}
    		
    		if (canAppend){
    			retVal = retVal + compareChar;
    		}else{
    			break;
    		}
    	}
    	
    	return retVal;
    }
    
    public static void main(String[] args){
    	LongestCommonPrefix obj = new LongestCommonPrefix();
    	
    	System.out.println(obj.longestCommonPrefix(new String[]{"ab", "abc", "abd"}));
    	System.out.println(obj.longestCommonPrefix(new String[]{"ab", "acc", "abd"}));
    }
}
