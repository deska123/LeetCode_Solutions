class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] output = new int[matrix.length];
        for(int a = 0; a < matrix[0].length; a++) {
            int sum = 0;
            for(int b = 0; b < matrix[a].length; b++) {
                if(matrix[a][b] == 1) sum++;
            }
            output[a] = sum;
        }
        return output;
    }
}
