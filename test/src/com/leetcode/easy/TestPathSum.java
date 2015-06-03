package com.leetcode.easy;

import junit.framework.TestCase;

import com.leetcode.easy.PathSum.TreeNode;

public class TestPathSum extends TestCase {
	private TreeNode createTreeNode1(PathSum pathSum){
		PathSum.TreeNode treeNode = pathSum.new TreeNode(0);
		return treeNode;
	}
	
	private TreeNode createTreeNode2(PathSum pathSum){
		PathSum.TreeNode root = pathSum.new TreeNode(5);
		root.left = pathSum.new TreeNode(4);
		root.right = pathSum.new TreeNode(8);
		root.left.left = pathSum.new TreeNode(11);
		root.left.left.left = pathSum.new TreeNode(7);
		root.left.left.right = pathSum.new TreeNode(2);
		root.right.left = pathSum.new TreeNode(13);
		root.right.right = pathSum.new TreeNode(4);
		root.right.right.right = pathSum.new TreeNode(1);
		
		return root;
	}
	
	private TreeNode createTreeNode3(PathSum pathSum){
		PathSum.TreeNode root = pathSum.new TreeNode(-2);
		root.left = pathSum.new TreeNode(-3);
		return root;
	}
	
	public void testPathSum() throws Exception {
		PathSum pathSum = new PathSum();
		
		PathSum.Solution solution = pathSum.new Solution();
		assertFalse(solution.hasPathSum(null, 0));
		assertTrue(solution.hasPathSum(createTreeNode1(pathSum), 0));
		assertFalse(solution.hasPathSum(createTreeNode1(pathSum), 1));
		assertTrue(solution.hasPathSum(createTreeNode2(pathSum), 22));
		assertTrue(solution.hasPathSum(createTreeNode3(pathSum), -5));
	}
}
