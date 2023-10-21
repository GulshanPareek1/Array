// don't forget edge case always consider 
// after write code , dry run and then see for edge cases
// you're just writing in all the solution about edge cases but yourself not even trying to see for edge cases 
// two pointer approach is best for these easy and medium level questions 
// try to implement it and oyu will find easy in most of the questions 

class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        if(m==0 ) return true;
        //if(n==0)  return false;
        int l=0, r=0;
        
        while(l<m && r<n)
        {
            if(s.charAt(l)==t.charAt(r))
            {
                l++;
                r++;
            }
            else
                r++;
            
            // we don't need to explicitly check for not equal condition it will come uncer else hence we don't need to put these two more checks 
            //if(l==m) return true;
            //if(r==n) return false;
            // if(s.charAt(l)!=t.charAt(r))
            // {
            //     r++;
            // }
            
        }
        
        if(l==m) return true;
        
        return false;
    }
}
