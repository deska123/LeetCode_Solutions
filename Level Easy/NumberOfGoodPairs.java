//https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int out = 0;
        for(int a = 1; a < nums.length; a++) {
            for(int b = a - 1; b >= 0; b--) {
                if(nums[a] == nums[b]) {
                    out++;
                }
            }
        }
        return out;
    }
}
