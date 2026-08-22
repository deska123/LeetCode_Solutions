class Solution {
    public String reversePrefix(String s, int k) {
        String outputs = "";
        for(int a = k - 1; a >= 0; a--) {
            outputs += Character.toString(s.charAt(a));
        }
        for(int b = k; b < s.length(); b++) {
            outputs += Character.toString(s.charAt(b));
        }
        return outputs;
    }
}
