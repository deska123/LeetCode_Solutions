//https://leetcode.com/problems/maximum-number-of-pairs-in-array/

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int output[] = new int[2];
        output[0] = 0;
        output[1] = 0;
        int[] freq = new int[101];
        for(int a = 0; a < 101; a++) {
            freq[a] = 0;
        }
        for(int b = 0; b < nums.length; b++) {
            freq[nums[b]]++;
        }
        for(int c = 0; c < 101; c++) {
            if(freq[c] > 0) {
                output[0] += freq[c] / 2;
                output[1] += freq[c] % 2;            }
        }
        return output;
    }
}
