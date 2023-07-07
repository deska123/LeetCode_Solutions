//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<Boolean>();
        int[] temp = new int[candies.length];
        for(int i = 0; i < candies.length; i++) {
            temp[i] = candies[i];
        }
        Arrays.sort(temp);
        int max = temp[temp.length - 1];
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                output.add(true);
            } else {
                output.add(false);
            }
        }
        return output;
    }
}
