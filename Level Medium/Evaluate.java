class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        String output = "";
        Map<String, String> dicts = new HashMap<>();
        for (List<String> tmp : knowledge) {
            dicts.put(tmp.get(0), tmp.get(1));
        }
        int a = 0;
        String tmpKey = "";
        boolean flagKey = false;
        while(a < s.length()) {
            if(flagKey) {
                if(s.charAt(a) == ')') {
                    flagKey = false;
                    if(dicts.get(tmpKey) != null) {
                        output += dicts.get(tmpKey);
                    } else {
                        output += "?";
                    }
                    tmpKey = "";
                } else {
                    tmpKey += Character.toString(s.charAt(a));
                }
            } else {
                if(s.charAt(a) == '(') {
                    flagKey = true;
                } else {
                    output += Character.toString(s.charAt(a));
                }
            }
            a++;
        }
        return output;
    }
}
