// before writing code first solve on pen and paper and 
// also conside edge cases 
// edge cases here are 
// k== length 
// all equal digits   ex - 1111 


class Solution {
    public String removeKdigits(String num, int k) {
        if(k==0) return num;
        int n = num.length();
        if(k==n) return "0";
        Stack<Character> st = new Stack();
        int i=0;
        while(i<n)
        {
            while(k>0 && !st.isEmpty() && st.peek()>num.charAt(i))
            {
                k--;
                st.pop();
            }
            st.push(num.charAt(i));
            i++;
        }
        
        // handle edge case like 
        // 1111 / 3333 same digits 
        
        while(k>0)
        {
            st.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            char ch = st.pop();
            sb.append(ch);
        }
        
        sb.reverse();
        
        // remove preceding zeros if there are 
        while(sb.length()>1 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
        
    }
}
