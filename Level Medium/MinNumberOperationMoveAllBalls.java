//https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box

class Solution {
    public int[] minOperations(String boxes) {
        int[] output = new int[boxes.length()];
        for(int a = 0; a < boxes.length(); a++) {
            output[a] = 0;
            for(int b = 0; b < boxes.length(); b++) {
                if(boxes.charAt(b) != '0') {
                    output[a] += Math.abs(b - a);
                }
            }
        }
        return output;
    }
}
