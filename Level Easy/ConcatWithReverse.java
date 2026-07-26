class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] output = new int[2 * nums.length];
        for(int a = 0; a < nums.length; a++) {
            output[a] = nums[a];
        }
        int seq = nums.length - 1;
        for(int b = nums.length; b < (2 * nums.length); b++) {
            output[b] = nums[seq];
            seq--;
        }
        return output;
    }
}
