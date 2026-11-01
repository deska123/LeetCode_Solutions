class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int a = 0; a < nums.length; a++) {
            String temp2 = Integer.toString(nums[a]);
            for(int b = 0; b < temp2.length(); b++) {
                temp.add(Integer.parseInt(temp2.charAt(b) + ""));
            }
        }
        int[] output = new int[temp.size()];
        int seq = 0;
        for(Integer a : temp) {
            output[seq] = a;
            seq++;
        }
        return output;
    }
}
