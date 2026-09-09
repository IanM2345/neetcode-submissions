class MyStack {

    private Stack <Integer> in;
    private Stack <Integer> out;

    public MyStack() {
        in = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
       return out.push(in.pop());
    }
    
    public int top() {
        return in.peek();
    }
    
    public boolean empty() {
       return in.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */