package com.leetcode.easy;

public class PathSum {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val) { this.val = val; }
	}
	
	public class Solution {
		public boolean hasPathSum(TreeNode root, int num){
			if (root == null)
				return false;
			
			if ((root.left == null) && (root.right == null)){
				return root.val == num;
			}else{
				boolean value = (root.left != null) && hasPathSum(root.left, num - root.val);
				value = value || ((root.right != null) && hasPathSum(root.right, num - root.val));
				return value;
			}
		}
	}
}
