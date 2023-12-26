class Solution {
    public int numberOfMatches(int n) {
        int output = 0;
        int curr = n;
        while(curr != 1) {
            output += (curr / 2);
            if(curr % 2 == 0) {
                curr /= 2;
            } else {
                curr = (curr / 2) + 1;
            }
        }
        return output;
    }
}
