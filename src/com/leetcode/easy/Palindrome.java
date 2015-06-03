package com.leetcode.easy;

public class Palindrome {
	public static void main(String[] argv) throws Exception{
		Solution solution = new Solution();

//		System.out.println("1231 is Palindrome?" + solution.isPalindrome(1231));
//		System.out.println("1221 is Palindrome?" + solution.isPalindrome(1221));
//		System.out.println("11111 is Palindrome?" + solution.isPalindrome(11111));
//		System.out.println("154 is Palindrome?" + solution.isPalindrome(154));
//		System.out.println("0 is Palindrome?" + solution.isPalindrome(0));
//		System.out.println("-1 is Palindrome?" + solution.isPalindrome(-1));
		System.out.println("1000110001 is Palindrome?" + solution.isPalindrome(1000110001));		
		System.out.println("Finish");
	}
}

class Solution {
	private int getDigitsCnt(int x){
		int retVal = 1;
		int tmp = x;
		while ((tmp = (tmp / 10)) > 0){
			retVal ++;
		}
		
		return retVal;
	}
	
    private int getHigherBit(int x, int digitsCnt, int number){
    	int tmp = x / ((int)Math.pow(10, (digitsCnt - number)));
    	return tmp % 10;
    }
    
    private int getLowBit(int x, int number){
    	int tmp = number;
    	int tmp1 = x;
    	while (tmp > 1){
    		tmp1 = tmp1 / 10;
    		tmp--;
    	}
    	
    	return tmp1 % 10;
    }
    
    public boolean isPalindrome(int x) {
    	if (x < 0) return false;
       int digitsCnt = this.getDigitsCnt(x);
       int compareCnt = digitsCnt / 2;
       int tmp = x;
       int cnt = 1;
       
       while (compareCnt != 0){
    	   int highBit = this.getHigherBit(tmp, digitsCnt, cnt);
    	   int lowBit = this.getLowBit(tmp, cnt);
    	   if (highBit != lowBit){
    		   return false;
    	   }
    	   //tmp need to be changed
    	   cnt ++;
    	   compareCnt --;
       }
       
       return true;
    }
}
