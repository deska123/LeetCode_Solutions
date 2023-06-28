// https://leetcode.com/problems/design-browser-history

class BrowserHistory {
    MyLinkedList myList;

    public BrowserHistory(String homepage) {
        myList = new MyLinkedList(homepage);
    }
    
    public void visit(String url) {
        myList.curr.next = new MyNode(url);
        myList.curr.next.prev = myList.curr;
        myList.curr = myList.curr.next;
    }
    
    public String back(int steps) {
        int i = 1;
        while(i <= steps) {
            if(myList.curr.prev == null) {
                return myList.curr.str;
            } else {
                myList.curr = myList.curr.prev;
            }
            i++;
        }
        return myList.curr.str;
    }
    
    public String forward(int steps) {
        int i = 1;
        while(i <= steps) {
            if(myList.curr.next == null) {
                return myList.curr.str;
            } else {
                myList.curr = myList.curr.next;
            }
            i++;
        }
        return myList.curr.str;
    }
}

class MyNode {
    String str;
    MyNode prev;
    MyNode next;

    public MyNode(String str) {
        this.str = str;
        prev = null;
        next = null;
    }
}

class MyLinkedList {
    MyNode curr;

    public MyLinkedList(String str) {
        curr = new MyNode(str);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
