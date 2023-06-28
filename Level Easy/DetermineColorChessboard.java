// https://leetcode.com/problems/determine-color-of-a-chessboard-square

class Solution {
    public boolean squareIsWhite(String coordinates) {
        boolean output = false;
        if(coordinates.charAt(0) == 'a' || coordinates.charAt(0) == 'c' || coordinates.charAt(0) == 'e' || coordinates.charAt(0) == 'g') {
            int a = 1;
            boolean curr = false;
            while(a < Integer.parseInt(coordinates.charAt(1) + "")) {
                if(curr) {
                    curr = false;
                } else {
                    curr = true;
                }
                a++;
            }
            output = curr;
        } else {
            int a = 1;
            boolean curr = true;
            while(a < Integer.parseInt(coordinates.charAt(1) + "")) {
                System.out.println(a);
                System.out.println(curr);
                if(curr) {
                    curr = false;
                } else {
                    curr = true;
                }
                a++;
            }
            output = curr;
        }
        return output;
    }
}
