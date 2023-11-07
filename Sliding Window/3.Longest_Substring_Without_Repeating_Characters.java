// simple sliding window question 
// just be patient and keep doing one by one step
// thought and executed by me only !!!!
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0,j=0,i=0;
        int n=s.length();
        HashMap<Character,Integer> map = new HashMap();
        //map.put(s.charAt(j),1);
        //j++;
        while(j<n)
        {
            char ch =s.charAt(j);
            while(map.containsKey(ch))
            {
                map.remove(s.charAt(i));
                i++;
            }
            map.put(ch,1);
            ans=Math.max(j-i+1,ans);
            j++;
        }
        
        return ans;
    }
}


// do on pen and paper and see the magic 
