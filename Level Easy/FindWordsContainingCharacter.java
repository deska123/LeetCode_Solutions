class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> output = new ArrayList<Integer>();
        for(int a = 0; a < words.length; a++) {
            if(words[a].contains(x + "")) {
                output.add(a);
            }
        }
        return output;
    }
}
