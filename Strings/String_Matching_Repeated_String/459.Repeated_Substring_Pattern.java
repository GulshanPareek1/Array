// Nice solution just do it on pen paper 
// that's all 
// all set 

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        
        for(int i=l/2;i>=1;i--)
        {
            // i should be divisor of length of string 
            // rather than making a substring and checking if s.contains(sb) that won't work as i've seen in case of i==1 so make whole string based on this logic 
            if(l%i==0)
            {
                StringBuilder sb = new StringBuilder();
                String str  = s.substring(0,i);
                int m = l/i;
                for(int j=0;j<m;j++)
                {
                    sb.append(str);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        
        return false;
    }
}
