//https://leetcode.com/problems/maximum-binary-tree

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int a = 0; a < nums.length; a++) {
            arr.add(nums[a]);
        }
        TreeNode tree = new TreeNode();
        genSubNode(tree, arr);
        return tree;
    }

    public void genSubNode(TreeNode currNode, ArrayList<Integer> currArr) {
        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();
        int compare = Integer.MIN_VALUE;
        int idx = -1;
        for(int a = 0; a < currArr.size(); a++) {
            if(currArr.get(a) > compare) {
                compare = currArr.get(a);
                idx = a;
            }
        }
        for(int a = 0; a < idx; a++) {
            leftArr.add(currArr.get(a));
        }
        for(int a = idx + 1; a < currArr.size(); a++) {
            rightArr.add(currArr.get(a));
        }
        currNode.val = compare;

        if(leftArr.size() > 0) {
            TreeNode leftNode = new TreeNode();
            genSubNode(leftNode, leftArr);
            currNode.left = leftNode;
        } else {
            currNode.left = null;
        }

        if(rightArr.size() > 0) {
            TreeNode rightNode = new TreeNode();
            genSubNode(rightNode, rightArr);
            currNode.right = rightNode;
        } else {
            currNode.right = null;
        }
    }
}
