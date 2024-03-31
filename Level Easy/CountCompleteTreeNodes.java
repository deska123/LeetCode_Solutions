class Solution {
    public int countNodes(TreeNode root) {
        return helper(root);
    }
    
    public int helper(TreeNode curr) {
        if(curr == null) {
            return 0;
        }
        if(curr.left == null && curr.right == null) {
            return 1;
        }
        return 1 + helper(curr.left) + helper(curr.right);
    }
} 
