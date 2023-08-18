//https://leetcode.com/problems/design-an-ordered-stream

class OrderedStream {
    String[] stream;
    int lastInserted;
        
    public OrderedStream(int n) {
        this.stream = new String[n];
        for(int i = 0; i < n; i++) {
            this.stream[i] = null;
        }
        this.lastInserted = 0;
    }
    
    public List<String> insert(int id, String value) {
        List<String> output = new ArrayList<String>();
        boolean flag = false;
        this.stream[id - 1] = value;
        int idx = this.lastInserted;
        while(!flag && idx < this.stream.length) {
            if(this.stream[idx] == null) {
                flag = true;
                continue;
            }
            output.add(this.stream[idx]);
            idx++;
        }
        this.lastInserted = idx;
        return output;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(id,value);
 */

