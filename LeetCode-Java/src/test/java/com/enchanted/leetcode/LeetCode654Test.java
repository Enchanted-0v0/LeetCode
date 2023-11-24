package com.enchanted.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName: LeetCode654Test
 * @Description: TODO
 * @PackageName:com.enchanted.leetcode
 * @Author Enchanted
 * @Date 2023/11/23 10:49
 * @Version 1.0
 */


public class LeetCode654Test {

    private LeetCode654 solution = new LeetCode654();

    @Test
    public void testConstructMaximumBinaryTree() {
        // Test data
        int[] nums = {3, 2, 1, 6, 0, 5};

        // Construct tree using the method
        TreeNode actual = solution.constructMaximumBinaryTree(nums);

        // Expected tree
        TreeNode expected = new TreeNode(6);
        expected.left = new TreeNode(3);
        expected.left.right = new TreeNode(2);
        expected.left.right.right = new TreeNode(1);
        expected.right = new TreeNode(5);
        expected.right.left = new TreeNode(0);

        // Verify the tree structure
        assertTreesEqual(expected, actual, "");
    }

    private void assertTreesEqual(TreeNode expected, TreeNode actual, String path) {
        if (expected == null && actual == null) return;
        if (expected == null || actual == null) {
            Assert.fail("Tree mismatch at path " + path + ": expected " + (expected == null ? "null" : expected.val) + ", but was " + (actual == null ? "null" : actual.val));
        }

        Assert.assertEquals("Tree value mismatch at path " + path, expected.val, actual.val);
        assertTreesEqual(expected.left, actual.left, path + "L");
        assertTreesEqual(expected.right, actual.right, path + "R");
    }
}

