package com.enchanted.Solution;

/**
 * @ClassName: TestLeetCode116
 * @Description: TODO: 测试-填充每个节点的下一个右侧节点指针
 * @PackageName:com.enchanted.Solution
 * @Author Enchanted
 * @Date 2023/10/17 13:07
 * @Version 1.0
 */
public class TestLeetCode116 {
    public static void main(String[] args) {
        LeetCode116 leetCode116 = new LeetCode116();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        leetCode116.connect(root);

    }
}
