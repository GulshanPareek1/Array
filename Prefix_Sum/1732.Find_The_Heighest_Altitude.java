// solved by me without any help and in first attempt ...

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int alt =0,maxAlt = 0;
        int i=0;
        while(i<n)
        {
            alt = alt+gain[i];
            maxAlt = Math.max(alt , maxAlt);
            i++;
        }
        
        return maxAlt;
    }
}
