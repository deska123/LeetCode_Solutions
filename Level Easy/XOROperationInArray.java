class Solution {
    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        int out = 0;
        for(int i = 0; i < n; i++) {
            out ^= nums[i];
        }
        return out;
    }
}
