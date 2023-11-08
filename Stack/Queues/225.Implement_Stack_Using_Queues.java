// now questions are being solved by time and without help 
// niceee!!!!

// class MyStack {

//     Queue<Integer> q ;
//     Queue<Integer> helpQ = new LinkedList();     // helping queue
//     public MyStack() {
//         q= new LinkedList();
//     }
    
//     public void push(int x) {
//         if(q.isEmpty())
//         {
//             q.add(x);
//         }
//         else
//         {
//             while(!q.isEmpty())
//             {
//                 helpQ.add(q.remove());
//             }
//             q.add(x);
//             while(!helpQ.isEmpty())
//             {
//                 q.add(helpQ.remove());
//             }
//         }
//     }
    
//     public int pop() {
//         return q.remove();
//     }
    
//     public int top() {
//         return q.peek();
//     }
    
//     public boolean empty() {
//         return q.size()==0;
//     }
// }

// ok so now we shoud optimise that space for the solution as we're using two ques so use only one 






class MyStack {
    Queue<Integer> q ;
    public MyStack() {
        q = new LinkedList();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=1;i<q.size();i++)
        {
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
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
