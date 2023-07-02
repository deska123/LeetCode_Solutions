//https://leetcode.com/problems/jewels-and-stones

class Solution {
    public int numJewelsInStones(String J, String S) {
        int out = 0;
        for(int i = 0; i < S.length(); i++) {
            if(J.contains(S.charAt(i) + "")) {
                out++;
            }
        }
        return out;
    }
}
