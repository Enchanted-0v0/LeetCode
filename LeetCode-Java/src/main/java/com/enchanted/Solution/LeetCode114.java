package com.enchanted.Solution;

import com.enchanted.DataStructure.Tree.TreeNode;


/**
 * @ClassName: LeetCode114
 * @Description: TODO: 二叉树展开为链表
 * @PackageName:com.enchanted.Solution
 * @Author Enchanted
 * @Date 2023/10/17 18:57
 * @Version 1.0
 */
public class LeetCode114 {

    public void flatten(TreeNode root) {

        if(root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;

        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}