//https://leetcode.com/problems/final-value-of-variable-after-performing-operations

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String str : operations) {
            switch(str){
                case "++X" :
                    x++;
                    break;
                case "X++" :
                    x++;
                    break;
                case "--X" :
                    x--;
                    break;
                case "X--" :
                    x--;
                    break;
            }
        }
        return x;
    }
}

