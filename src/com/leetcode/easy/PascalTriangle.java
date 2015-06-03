package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	private static void outputTriangle(List<List<Integer>> rows){
		StringBuffer sb = new StringBuffer();
		sb.append("[\n");
		
		for (List<Integer> curRow : rows){
			sb.append("[");
			for (Integer cell : curRow){
				sb.append(cell + ",");
			}
			sb.append("]\n");
		}
		
		sb.append("]\n");
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] argv) throws Exception{
		Solution solution = new Solution();
		List<List<Integer>> retVal = solution.generate(1);
		outputTriangle(retVal);
		outputTriangle(solution.generate(2));
		outputTriangle(solution.generate(3));
		outputTriangle(solution.generate(4));
		outputTriangle(solution.generate(5));
	}

	static class Solution{
	    public List<List<Integer>> generate(int numRows) {
	    	List<List<Integer>> retVal = new ArrayList<List<Integer>>();
	    	
	    	if (numRows > 0){
		    	Integer[] prevRow = null;
		    	for (int index = 1; index <= numRows; index++){
		    		Integer[] currRow = new Integer[index];
		    		currRow[0] = new Integer(1);
		    		currRow[currRow.length - 1] = new Integer(1);
		    		for (int index1 = 1; index1 < (currRow.length - 1); index1++){
		    			currRow[index1] = new Integer(prevRow[index1 - 1].intValue() + prevRow[index1].intValue());
		    		}
		    		prevRow = currRow;
		    		
		    		List<Integer> row = new ArrayList<Integer>();
		    		for (Integer intTmp : currRow){
		    			row.add(intTmp);
		    		}
		    		retVal.add(row);
		    	}
	    	}
	        return retVal;
	    }
	}	
}

