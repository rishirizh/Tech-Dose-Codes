class MyStack {
    public Queue<Integer> queue;
    public MyStack() {
        this.queue = new LinkedList<>();
    }
    
    public void push(int x) {
        this.queue.add(x);
        int len = this.queue.size();
        while (true){
            if (!queue.isEmpty()){
                int currentNumber = this.queue.peek();
                if(currentNumber == x){
                    break;
                }
                int popNumber = this.queue.poll();
                this.queue.add(popNumber);
            }
            else{
                this.queue.add(x);
                break;
            }

        }
    }
    
    public int pop() {
        return this.queue.poll();
    }
    
    public int top() {
        return this.queue.peek();
    }
    
    public boolean empty() {
        return this.queue.isEmpty();   
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
