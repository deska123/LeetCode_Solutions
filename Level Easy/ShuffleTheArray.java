//https://leetcode.com/problems/shuffle-the-array

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] out = new int[nums.length];
        int i = 0;
        int k = n;
        for(int j = 0; j < (nums.length / 2); j++) {
            out[i++] = nums[j];
            out[i++] = nums[k];
            k++;
        }
        return out;
    }
}
