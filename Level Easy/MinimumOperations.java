class Solution {
    public int minimumOperations(int[] nums) {
        int output = 0;
        for(int a = 0; a < nums.length; a++) {
            if(nums[a] % 3 != 0) {
                output += Math.min(nums[a] % 3, 3 - (nums[a] % 3));
            }
        }
        return output;
    }
}
