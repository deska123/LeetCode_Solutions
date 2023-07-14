//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences

class Solution {
    public int mostWordsFound(String[] sentences) {
        int output = Integer.MIN_VALUE;
        for(String str : sentences) {
            int mySize = str.split(" ").length;
            if(mySize > output) {
                output = mySize;
            }
        }
        return output;
    }
}
