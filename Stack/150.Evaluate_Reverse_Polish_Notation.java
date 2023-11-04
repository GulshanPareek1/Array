// here i learnt two things 
// we can't compare string direct like this token[i]=="+"
// rather use .equals method 
// we can also use switch for missing this comparing step 

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        //int a,b;
        for(int i=0;i<tokens.length;i++)  
        //for(String s:tokens)
        {
            if(tokens[i].equals("+") )
            {
                st.push(st.pop()+st.pop());
            }
            else if(tokens[i].equals("-"))
            {
                int a=st.pop();
                int b= st.pop();
                st.push(b-a);    
            }
            else if(tokens[i].equals("*"))
            {
                st.push(st.pop() * st.pop());
            }
            else if(tokens[i].equals("/"))
            {
                int a=st.pop();
                int b= st.pop();
                st.push(b/a);   
            }
            else
            {
                // for converting string to integer (int)
                st.push(Integer.parseInt(tokens[i]));
               
            }
        }
        return st.peek();
    }
}
        
//         for (String s : tokens) {
// 			if(s=="+") {
// 				S.add(S.pop()+S.pop());
// 			}
// 			else if(s.equals("/")) {
// 				b = S.pop();
// 				a = S.pop();
// 				S.add(a / b);
// 			}
// 			else if(s.equals("*")) {
// 				S.add(S.pop() * S.pop());
// 			}
// 			else if(s.equals("-")) {
// 				b = S.pop();
// 				a = S.pop();
// 				S.add(a - b);
// 			}
// 			else {
// 				S.add(Integer.parseInt(s));
// 			}
// 		}	
//         return S.pop();
//     }
// }


  
  
//     switch (a[i]) {
//       case "+":
//         stack.push(stack.pop() + stack.pop());
//         break;
          
//       case "-":
//         stack.push(-stack.pop() + stack.pop());
//         break;
          
//       case "*":
//         stack.push(stack.pop() * stack.pop());
//         break;



// public int evalRPN(String[] a) {
//   Stack<Integer> stack = new Stack<Integer>();
  
//   for (int i = 0; i < a.length; i++) {
//     switch (a[i]) {
//       case "+":
//         stack.push(stack.pop() + stack.pop());
//         break;
          
//       case "-":
//         stack.push(-stack.pop() + stack.pop());
//         break;
          
//       case "*":
//         stack.push(stack.pop() * stack.pop());
//         break;

//       case "/":
//         int n1 = stack.pop(), n2 = stack.pop();
//         stack.push(n2 / n1);
//         break;
          
//       default:
//         stack.push(Integer.parseInt(a[i]));
//     }
//   }
  
//   return stack.pop();
// }
