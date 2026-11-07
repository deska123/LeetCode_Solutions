class Solution {
    public int smallestIndex(int[] nums) {
        int output = -1;
        for(int a = 0; a < nums.length; a++) {
            String temp = Integer.toString(nums[a]);
            int tempSum = 0;
            for(int b = 0; b < temp.length(); b++) {
                tempSum += Integer.parseInt(temp.charAt(b) + "");
            }
            if(output == -1) {
                if(tempSum == a) {
                    output = a;
                }
            } else {
                if(tempSum == a && tempSum < output) {
                    output = a;
                }
            }
        }
        return output;
    }
}
