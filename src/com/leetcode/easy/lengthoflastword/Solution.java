package com.leetcode.easy.lengthoflastword;

public class Solution {
    public int lengthOfLastWord1(String s) {
    	if ((s == null) || (s.length() == 0))
    		return 0;
    	
    	String lastWord = "";
    	int startIndex = 0;
    	int endIndex = s.length() - 1;
    	while ((startIndex < s.length()) &&
    			(s.charAt(startIndex) == ' ')) startIndex++;
    	while ((endIndex > 0) &&
    			(s.charAt(endIndex) == ' ')) endIndex--;
    	
    	//whole string is an empty string
    	if (startIndex == s.length()) return 0;
    	
    	for (int index = startIndex; index <= endIndex; index++){
    		if (s.charAt(index) != ' '){
    			lastWord += String.valueOf(s.charAt(index));
    		}else{
    			lastWord = "";
    		}
    	}
    	return lastWord.length();
    }
    
    public int lengthOfLastWord(String s) {
    	if ((s == null) || (s.length() == 0))
    		return 0;
    	
    	String process = s.trim();
    	String[] segs = process.split(" ");
    	for (int index = segs.length - 1; index >= 0; index--){
    		int tmpLen = segs[index].trim().length();
    		if (tmpLen != 0)
    			return tmpLen;
    	}
    	
    	return 0;
    }
    
    public static void main(String[] arg){
    	Solution obj = new Solution();
    	obj.lengthOfLastWord("a");
    }
}
