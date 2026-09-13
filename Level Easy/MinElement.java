class Solution {
    public int minElement(int[] nums) {
        int output = Integer.MAX_VALUE;
        for(int a = 0; a < nums.length; a++) {
            String temp = Integer.toString(nums[a]);
            int sum = 0;
            for(int b = 0; b < temp.length(); b++) {
                sum += Integer.parseInt(temp.charAt(b) + "");
            }
            if(sum < output) {
                output = sum;
            }
        }
        return output;
    }
}
