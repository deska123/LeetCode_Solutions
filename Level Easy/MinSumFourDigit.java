//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/

class Solution {
    public int minimumSum(int num) {
        String text = Integer.toString(num);
        char[] charArr = text.toCharArray();
        Arrays.sort(charArr);
        return Integer.parseInt((charArr[0] + "") + (charArr[3] + "")) + Integer.parseInt((charArr[1] + "") + (charArr[2] + ""));
    }
}
