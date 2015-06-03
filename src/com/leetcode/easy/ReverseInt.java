package com.leetcode.easy;

public class ReverseInt {
	public static void main(String[] args) throws Exception{
		Solution solution = new Solution();
		System.out.println(solution.reverse(0));
		System.out.println(solution.reverse(1));
		System.out.println(solution.reverse(-1));
		System.out.println(solution.reverse(12));
		System.out.println(solution.reverse(-12));
		System.out.println(solution.reverse(1234));
		System.out.println(solution.reverse(-1234));
	}
	
	static class Solution{
		private int getDigitsCnt(int x){
			int retVal = 1;
			int tmp = x;
			while ((tmp = (tmp / 10)) > 0){
				retVal ++;
			}
			
			return retVal;
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
	    
		public int reverse(int x) {
			int tmp = Math.abs(x);
			int sum = 0;
			int digitsCnt = this.getDigitsCnt(tmp);
			for (int index = 1; index <= digitsCnt; index++){
				int power = (int)Math.pow(10, (digitsCnt - index));
				sum += this.getLowBit(tmp, index) * power;
			}
			
			return (x < 0) ? ( 0 - sum ) : sum;
	    }		
	}
}
