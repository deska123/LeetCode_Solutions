class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int output = 0;
        List<List<String>> outer = new ArrayList<List<String>>();
        outer = items;
        for(int a = 0; a < outer.size(); a++) {
            List<String> inner = new ArrayList<String>();
            inner = outer.get(a);
            if(ruleKey.equals("type") && ruleValue.equals(inner.get(0))) {
                output++;
            } else if(ruleKey.equals("color") && ruleValue.equals(inner.get(1))) {
                output++;
            } else if(ruleKey.equals("name") && ruleValue.equals(inner.get(2))) {
                output++;
            }
        }
        return output;
    }
}
