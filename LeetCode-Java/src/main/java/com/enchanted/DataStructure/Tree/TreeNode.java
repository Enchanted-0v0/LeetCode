package com.enchanted.DataStructure.Tree;

/**
 * @ClassName: TreeNode
 * @Description: TODO: Definition for a binary tree node.
 * @PackageName:com.enchanted.DataStructure.Tree
 * @Author Enchanted
 * @Date 2023/10/13 09:08
 * @Version 1.0
 */
public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
