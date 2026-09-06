class Solution {
    public int[] transformArray(int[] nums) {
        int[] output = new int[nums.length];
        int evens = 0, odds = 0;
        for(int a = 0; a < nums.length; a++) {
            if(nums[a] % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        int b = 0;
        for(int a = 1; a <= evens; a++) {
            output[b] = 0;
            b++;
        }
        for(int a = 1; a <= odds; a++) {
            output[b] = 1;
            b++;
        }
        return output;
    }
}
