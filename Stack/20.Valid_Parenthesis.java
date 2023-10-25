// one more nice approach 
class Solution{
    public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}

}





// // valid parenthesis 
// // stack methods 
// // .push , .pop() , st.isEmpty() , st.peek()
// class Solution {
//     public boolean isValid(String s) {
//         if(s.length()==0) return true;
//         Stack<Character> st = new Stack<>();
        
//         for(int i=0;i<s.length();i++)
//         {
//             char ch= s.charAt(i);
//             if(ch=='{' ||ch=='(' || ch=='[')
//             {
//                 st.push(ch);
//             }
//             // first insert the elemnts of string otherwise there will be EmptyStackException 
//             if(ch=='}' )
//             {
//                 //if(st.peek()!='{' || st.isEmpty())   // put the empty stack condition before 
//                 if(st.isEmpty() || st.peek()!='{'  )
//                 {
//                     return false;
//                 }
//                 else
//                     st.pop();
//             }
//             if( ch==']' )
//             {
//                 if(st.isEmpty() || st.peek()!='[' )
//                 {
//                     return false;
//                 }
//                 else
//                     st.pop();
//             }
//             if( ch==')' )
//             {
//                 if( st.isEmpty() || st.peek()!='(' )
//                 {
//                     return false;
//                 }
//                 else
//                     st.pop();
//             }
            
            
//         }
        
        
//         return st.isEmpty();
//         //return true;      // not valid for odd no of elements
//     }
// }
