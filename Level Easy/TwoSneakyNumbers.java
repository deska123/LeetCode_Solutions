class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] output = new int[2];
        int idx = 0;
        HashMap<Integer, Integer> maps = new HashMap<>();
        for(int a = 0; a <= 101; a++) {
            maps.put(a, 0);
        }
        for(int b = 0; b < nums.length; b++) {
            int temp = maps.get(nums[b]);
            temp += 1;
            maps.put(nums[b], temp);
        }
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if(entry.getValue() > 1) {
                output[idx] = entry.getKey();
                idx += 1;
            }
        }
        return output;
    }
}
