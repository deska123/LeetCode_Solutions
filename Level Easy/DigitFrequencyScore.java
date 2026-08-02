class Solution {
    public int digitFrequencyScore(int n) {
        int output = 0;
        String temp = Integer.toString(n);
        for(int a = 0; a < temp.length(); a++) {
            output += Integer.parseInt(temp.charAt(a) + "");
        }
        return output;
    }
}
