package com.enchanted.Solution;

import com.enchanted.DataStructure.Tree.TreeNode;

/**
 * @ClassName: LeetCode226
 * @Description: TODO：翻转二叉树
 * @PackageName:com.enchanted.Solution
 * @Author Enchanted
 * @Date 2023/10/13 09:11
 * @Version 1.0
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class LeetCode266 {


    /**
     * 翻转二叉树：分解问题（递归）
     *
     * @param root
     * @return TreeNode
     */
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}

//public class LeetCode266 {
//
//
//    /**
//     * 翻转二叉树：遍历思想
//     *
//     * @param root
//     * @return TreeNode
//     */
//    public TreeNode invertTree(TreeNode root) {
//        traverse(root);
//        return root;
//
//
//    }
//
//    // TODO: 二叉树遍历函数
//    void traverse(TreeNode root) {
//        if(root == null) {
//            return;
//        }
//
//        TreeNode tmp = root.left;
//        root.left = root.right;
//        root.right = tmp;
//
//        traverse(root.left);
//        traverse(root.right);
//    }
//
//}