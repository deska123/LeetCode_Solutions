//https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        nums = Arrays.copyOf(nums, nums.length * 2);
        for(int i = 0; i <= (nums.length / 2) - 1; i++) {
            nums[i + (nums.length / 2)] = nums[i];
        }
        return nums;
    }
}
