class Solution {
    public String reverseWords(String s) {
        
        // ok ok 
        int n = s.length();
        int i=0 , j=0;
        String ans= "";
        while(i<n)
        {
            while(i<n && s.charAt(i)==' ')
            {
                i++;
            } 
            if(i>=n) break;
              j=i+1;
            while(j<n && s.charAt(j)!=' ')
            {
                j++;
            }
            String res = s.substring(i,j);
            
            if(ans=="")
            {
                ans = res;
            }
            else
            {
                ans = res +" " + ans;
            }
            i=j+1;
        }
        
        return ans;
    }
}
