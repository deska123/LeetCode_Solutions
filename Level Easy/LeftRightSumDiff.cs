//https://leetcode.com/problems/left-and-right-sum-differences/

public class Solution {
    public int[] LeftRightDifference(int[] nums) {
        int[] output = new int[nums.Length];
        int leftSum, rightSum;
        for(int a = 0; a < nums.Length; a++) {
            leftSum = 0;
            for(int b = a - 1; b >= 0; b--) {
                leftSum += nums[b];
            }
            rightSum = 0;
            for(int b = a + 1; b < nums.Length; b++) {
                rightSum += nums[b];
            }
            output[a] = Math.Abs(leftSum - rightSum);
        }
        return output;
    }
}
