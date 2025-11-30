public class Solution {
    public int AlternatingSum(int[] nums) {
        int sum = 0;
        for(int a = 0; a < nums.Length; a++) {
            if(a % 2 == 0) {
                sum += nums[a];
            } else {
                sum -= nums[a];
            }
        }
        return sum;
    }
}
