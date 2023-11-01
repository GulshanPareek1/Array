//Note: This question is the same as 1081: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
//Learnings  - Monotonic Stack  , Array char storing , 
class Solution {
    public String smallestSubsequence(String s) {
        //public String removeDuplicateLetters(String s) {
        //monotonic stack  (keep everything in integer format not in chracter)
        Stack<Integer> st = new Stack();
        //for storing LastIndex
        int[] lastIndex = new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            lastIndex[s.charAt(i)-'a'] = i;
            //store lastindex at respective place
        }
        // array for storing seen or not the char value 
        boolean[] seen = new boolean[26];
        // and array for check if visited or not 
        
        for(int i=0;i<s.length();i++)
        {
            int curr = s.charAt(i)-'a';    // find integer value of respective char 
            
            if(seen[curr]) continue;
            
            while(!st.isEmpty() && st.peek()>curr && i<lastIndex[st.peek()])
            {
                seen[st.pop()] = false;
            }
            
            st.push(curr);
            seen[curr] = true;
        }
        
        // now we have final answer stored in stack now change it into string 
        
        //here can't use String because String is immutable 
        // so we use StringBuiler to append the values 
        //String sb = new String();
        //StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer();
        while(!st.isEmpty())
        {
            sb.append((char)(st.pop()+'a'));
        }
        
        return sb.reverse().toString();
        
    }
    
}
