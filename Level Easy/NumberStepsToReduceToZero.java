//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps (int num) {
        int output = 0;
        int curr = num;
        while(curr > 0) {
            if(curr % 2 == 0) {
                curr /= 2;
                output++;
            } else {
                curr--;
                output++;
            }
        }
        return output;
    }
}
