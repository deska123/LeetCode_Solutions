//https://leetcode.com/problems/goal-parser-interpretation/

class Solution {
    public String interpret(String command) {
        String output = "";
        int idx = 0;
        while(idx < command.length()) {
            if(command.charAt(idx) == 'G') {
                output += "G";
                idx += 1;
            } else if(command.charAt(idx) == '(') {
                if(command.charAt(idx + 1) == ')') {
                    output += "o";
                    idx += 2;
                } else {
                   output += "al";
                   idx += 4;
                }
            }
        }
        return output;
    }
}
