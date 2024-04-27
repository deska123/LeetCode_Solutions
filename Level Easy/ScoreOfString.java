class Solution {
    public int scoreOfString(String s) {
        int total = 0;
        for(int a = 1; a < s.length(); a++) {
            int fs = (int)s.charAt(a);
            int ss = (int)s.charAt(a - 1);
            total += Math.abs(fs - ss);
        }
        return total;
    }
}
