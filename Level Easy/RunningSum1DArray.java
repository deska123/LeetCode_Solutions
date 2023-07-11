//https://leetcode.com/problems/running-sum-of-1d-array

class Solution {
    public int[] runningSum(int[] nums) {
        int[] out = new int[nums.length];
        int sums = 0;
        for(int i = 0; i < nums.length; i++) {
            sums += nums[i];
            out[i] = sums;
        }
        return out;
    }
}
