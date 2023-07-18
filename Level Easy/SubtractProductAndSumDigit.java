//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        String temp = n + "";
        for(int a = 0; a < temp.length(); a++) {
            sum += Integer.parseInt(temp.charAt(a) + "");
            product *= Integer.parseInt(temp.charAt(a) + "");
        }
        return product - sum;
    }
}
