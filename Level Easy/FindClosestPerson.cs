public class Solution {
    public int FindClosest(int x, int y, int z) {
        if(Math.Abs(z - x) < Math.Abs(z - y)) return 1;
        if(Math.Abs(z - y) < Math.Abs(z - x)) return 2;
        return 0;
    }
}
