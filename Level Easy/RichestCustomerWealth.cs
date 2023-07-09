//https://leetcode.com/problems/richest-customer-wealth/

using System.Linq;

public class Solution {
    public int MaximumWealth(int[][] accounts) {
        int output = Int32.MinValue;
        for(int a = 0; a < accounts.Length; a++) {
            if(accounts[a].Sum() > output) {
                output = accounts[a].Sum();
            }
        }
        return output;
    }
}
