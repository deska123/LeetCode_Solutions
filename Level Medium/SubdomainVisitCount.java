//https://leetcode.com/problems/subdomain-visit-count/

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> maps = new HashMap<String, Integer>();
        for(int a = 0; a < cpdomains.length; a++) {
            String[] temp = cpdomains[a].split(" ");
            int count = Integer.parseInt(temp[0]);
            String[] temp2 = temp[1].split("\\.");
            String curr = "";
            for(int b = temp2.length - 1; b >= 0; b--) {
                if(b == temp2.length - 1) {
                    curr = temp2[b];
                } else {
                    curr = temp2[b] + "." + curr;
                }
                
                if(maps.get(curr) == null) {
                    maps.put(curr, count);
                } else {
                    maps.put(curr, count + maps.get(curr));
                }
            }
        }
        List<String> out = new ArrayList<String>();
        for (String i : maps.keySet()) {
            out.add(maps.get(i) + " " + i);
        }
        return out;
    }
}
