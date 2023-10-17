class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans= new ArrayList<Boolean>(candies.length);
        // first find maxx in array 
        //int maxx = Integer.MIN_VALUE;   
        int maxx = 0;   // bcz candies can't be in negative numbers 
        for(int i=0;i<candies.length ; i++)
        {
            if(maxx <= candies[i])
            {
                maxx = candies[i];
            }
        }
        
        for(int i=0;i<candies.length ; i++)
        {
            if(candies[i]+extraCandies>= maxx)
            {
                ans.add(i , true);
            }
            else
            {
                ans.add(i , false);
            }
        }
        
        return ans;
    }
}
