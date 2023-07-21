//https://leetcode.com/problems/range-sum-of-bst

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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int rootVal = 0;
        if(root.val >= low && root.val <= high) {
            rootVal = root.val;
        }
        return rootVal + helper(root.left, low, high) + helper(root.right, low, high);
    }
    
    public int helper(TreeNode curr, int low, int high) {
        if(curr == null) {
            return 0;
        }
        int currVal = 0;
        if(curr.val >= low && curr.val <= high) {
            currVal = curr.val;
        }
        return currVal + helper(curr.left, low, high) + helper(curr.right, low, high);
    }
}
