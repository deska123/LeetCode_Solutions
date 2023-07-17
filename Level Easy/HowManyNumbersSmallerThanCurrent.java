//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] out = new int[nums.length];
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        for(int j = 0; j < nums.length; j++) {
            int count = 0;
            for(int k = 0; k < temp.length; k++) {
                if(temp[k] >= nums[j]) {
                    break;
                }
                count++;
            }
            out[j] = count;
        }
        return out;
    }
}
