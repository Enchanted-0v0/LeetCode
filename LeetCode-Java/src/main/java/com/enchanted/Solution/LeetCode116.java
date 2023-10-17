package com.enchanted.Solution;

import java.util.Iterator;

/**
 * @ClassName: LeetCode116
 * @Description: TODO: 填充每个节点的下一个右侧节点指针
 * @PackageName:com.enchanted.Solution
 * @Author Enchanted
 * @Date 2023/10/17 12:53
 * @Version 1.0
 */

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
public class LeetCode116 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

       traverse(root.left, root.right);

        return root;
    }
    void traverse(Node node1, Node node2) {

        if (node1 == null || node2 == null) {
            return;
        }

        node1.next = node2;

        traverse(node1.left, node1.right);
        traverse(node2.left, node2.right);

        traverse(node1.right, node2.left);

    }

    }
