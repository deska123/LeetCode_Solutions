class Solution {
    public int sumOfSquares(int[] nums) {
        int output = 0;
        for(int a = 0; a < nums.length; a++) {
            if((nums.length % (a + 1)) == 0) {
                output += (nums[a] * nums[a]);
            }
        }
        return output;
    }
}
