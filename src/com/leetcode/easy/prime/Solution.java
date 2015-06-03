package com.leetcode.easy.prime;

public class Solution {
    public boolean isPrime(int n){
    	if (n <= 1) return false;
        if (n == 2) return true;
        if ((n % 2) == 0) return false;
        
        for (int i = 3; i * i <= n; i+=2){
            if ((n % i) == 0) return false;
        }
        
        return true;
    }
    public int countPrimes(int n) {
    	if (n <= 1)
    		return 0;
    	
        int cnt = 0;
        
        int[] prime = new int[n + 1];
        prime[1] = 0;
        
        for (int index = 2; index < (n + 1); index++){
        	prime[index] = 1;
        }
        
        for (int index = 2; index < n; index++){
        	if (prime[index] == 0)
        		continue;
            if (isPrime(index)){
                prime[index] = 1;
                for (int i = 2 * index; i < n; i += index){
                	prime[i] = 0;
                }
                cnt++;
            }else{
            	prime[index] = 0;
            }
        }
        
        return cnt;
    }
    
    public static void main(String[] arg){
    	long time = System.currentTimeMillis();
    	System.out.println(new Solution().countPrimes(3));
    	System.out.println(System.currentTimeMillis() - time);
    }
}