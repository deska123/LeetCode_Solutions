//https://leetcode.com/problems/maximum-sum-of-an-hourglass

class Solution {
    public int maxSum(int[][] grid) {
        int output = 0;
        for(int a = 0; a <= grid.length - 3; a++) {
            for(int b = 0; b <= grid[0].length - 3; b++) {
                output = Math.max(output, grid[a][b] + grid[a][b + 1] + grid[a][b + 2] + grid[a + 1][b + 1] + grid[a + 2][b] + grid[a + 2][b + 1] + grid[a + 2][b + 2]);
            }
        }
        return output;
    }
}
