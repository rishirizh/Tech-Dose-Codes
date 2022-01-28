class MyQueue {
    Stack<Integer> stack1,stack2;
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
        
    }
    
    public void push(int x) {
        this.stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.empty())
        stack2.push(stack1.pop());
    
        int ans = stack2.pop();
    
        while(!stack2.empty())
            stack1.push(stack2.pop());
    
        return ans;
        
    }
    
    public int peek() {
        while(!stack1.empty())
            stack2.push(stack1.pop());
    
        int ans = stack2.peek();
    
        while(!stack2.empty())
            stack1.push(stack2.pop());
    
        return ans;
        
    }
    
    public boolean empty() {
        return this.stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
