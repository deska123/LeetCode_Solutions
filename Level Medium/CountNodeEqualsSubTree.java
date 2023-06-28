// https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree

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
class Solution {
    public int averageOfSubtree(TreeNode root) {
        return drive(root);
    }

    public int drive(TreeNode curr) {
        if(curr == null) return 0;
        if(findSum(curr) / findCount(curr) == curr.val) return 1 + drive(curr.left) + drive(curr.right);
        return drive(curr.left) + drive(curr.right);
    }

    public int findSum(TreeNode curr) {
        if(curr == null) return 0;
        return curr.val + findSum(curr.left) + findSum(curr.right);
    }

    public int findCount(TreeNode curr) {
        if(curr == null) return 0;
        return 1 + findCount(curr.left) + findCount(curr.right);
    }
}
