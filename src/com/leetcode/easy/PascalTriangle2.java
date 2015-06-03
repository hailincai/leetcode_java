package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
	private static void outputTriangle(List<Integer> row){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		for (Integer cell : row){
			sb.append(cell + ",");
		}
		
		sb.append("]\n");
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] argv) throws Exception{
		Solution solution = new Solution();
		outputTriangle(solution.getRow(0));
		outputTriangle(solution.getRow(1));
		outputTriangle(solution.getRow(2));
		outputTriangle(solution.getRow(3));
		outputTriangle(solution.getRow(4));
		outputTriangle(solution.getRow(5));
	}

	static class Solution{
		public List<Integer> getRow(int rowIndex) {
			List<List<Integer>> rows = generate(rowIndex + 1);
			return rows.get(rowIndex);
		}
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
