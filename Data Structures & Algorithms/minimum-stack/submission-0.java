class MinStack {

    private Stack<Integer> s1;
    private Stack<Integer> minStack;

    public MinStack() {
      s1 = new Stack<>();
      minStack = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val)
        {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(!s1.isEmpty())
        {
           int top = s1.pop();
           if(minStack.peek() == top)
           {
            minStack.pop();
           }
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
