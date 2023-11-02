// use two stacks for making them queue 
//and here we can use one more method but that's O(N) time complexity 
// while pushing the element perform these 
// S1 to S2 
// push to S1 
// then S2 to S1 
// bcz of these S1 will act as Queue (try on paper )
class MyQueue {

    Stack<Integer> ip = new Stack();
    Stack<Integer> op = new Stack();
    public MyQueue() {
        // constructor 
    }
    
    public void push(int x) {
        ip.push(x);
    }
    
    public int pop() {
        if(!op.isEmpty())
        {
            return op.pop();
        }
        else
        {
            while(!ip.isEmpty())
            {
                op.push(ip.pop());
            }
            
            return op.pop();
        }
    }
    
    public int peek() {
        if(!op.isEmpty())
        {
            return op.peek();
        }
        else
        {
            while(!ip.isEmpty())
            {
                op.push(ip.pop());
            }
            
            return op.peek();
        }
    }
    
    public boolean empty() {
        return ip.isEmpty() && op.isEmpty();
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
