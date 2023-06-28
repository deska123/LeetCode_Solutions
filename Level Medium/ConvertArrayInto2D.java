//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        int[] freq = new int[201];
        for(int a = 0; a < 201; a++) {
            freq[a] = 0;
        }
        for(int a = 0; a < nums.length; a++) {
            freq[nums[a]]++;
        }
        boolean flag = true;
        while(flag) {
            boolean flag2 = false;
            List<Integer> inner = new ArrayList<Integer>();
            for(int a = 0; a < 201; a++) {
                if(freq[a] > 0) {
                    inner.add(a);
                    freq[a]--;
                    flag2 = true;
                }
            }
            if(!flag2) {
                flag = false;
            } else {
                output.add(inner);
            }
        }
        return output;
    }
}
