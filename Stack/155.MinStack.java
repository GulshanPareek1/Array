// there are 3 approaches for solving this focus more on two stack approach es.....

// solve using two stacks , one for keeping all the values another one for tracking  minimum values 


class MinStack {

    Stack<Integer> st;
    Stack<Integer> min;
    public MinStack() {
        st = new Stack();
        min = new Stack();
    }
    
    public void push(int val) {
        
        if(min.isEmpty() || val<=min.peek())
        {
            min.push(val);
        }
        
        st.push(val);
    }
    
    public void pop() {
        if(st.peek().equals(min.peek()))
        {
            min.pop();
        }
        
        st.pop();
        
    }
    
    public int top() {
        // for all the empty and stuff stack will handle bcz we are making the stack from Stack class which has all the properties included 
        
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */




// type casting is only possible for long and for Long as it's class use methods (.valueOf  , .intValue ,)
// only O(1) time solution for every solution 
// class MinStack {

//     private long mini = Integer.MAX_VALUE;
//     Stack<Long> st = new Stack();
//     // constructor 
//     public MinStack() {
//         Stack<Integer> st = new Stack();
//     }
    
//     public void push(int val) {
//         // check if stack is empty first 
//         long value=(long) val;
//         if(st.isEmpty())
//         {
//             mini=value;
//             st.push(value);
//         }
//         else
//         {
//             if(value<mini)
//             {
//                 st.push(2*value-mini);
//                 mini = value;
//             }
//             else
//             {
//                 st.push(value);
//             }
//         }
        
        
//        // mini = Math.min(mini,val);
        
//     }
    
//     public void pop() {
//         if(st.isEmpty())
//         {
//             return;
//         }
//         long el = (long)st.peek();
//         if(el<mini)
//         {
//             // it's the changed pushed value 
            
//             mini = (2*mini-st.peek());
            
            
//         }
        
//         st.pop();
//     }
    
//     public int top() {
//         if(st.isEmpty()) return -1;
//         long el = (long)st.peek();
//          if(el<mini)
//          {
//              // its the changed pushed value
//              //return (2*mini-st.peek());
//              return (int)mini;
//          }
        
//         return (int)el;
//     }
    
//     public int getMin() {
//         // if(st.isEmpty())
//         // {
//         //     return Integer.MIN_VALUE;
//         // }
        
//         return (int)mini;
//     }
// }
class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current 
        // minimum value changes after pushing the new value x
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
