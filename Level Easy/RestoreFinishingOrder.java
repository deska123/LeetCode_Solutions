class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> sets = new HashSet<Integer>();
        for(int b = 0; b < friends.length; b++) {
            sets.add(friends[b]);
        }
        int[] output = new int[friends.length];
        int i = 0;
        for(int a = 0; a < order.length; a++) {
            if(sets.contains(order[a])) {
                output[i] = order[a];
                i++;
            }
        }
        return output;
    }
}
