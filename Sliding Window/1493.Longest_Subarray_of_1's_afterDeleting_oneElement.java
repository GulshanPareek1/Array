// hurray!!!! its working in first time thought and coded by me !!!!!!!!

class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i=0,j=0;
        //int len=0;
        int maxLength=0;
        int count=0;
        while(j<n)
        {
            if(nums[j]==0)
            {
                count++;
                
                if(count>1)
                {
                    while(count!=1 && i<=j)
                    {
                        if(nums[i]==0)
                        {
                            count--;
                        }
                        i++;
                    }
                }
            }
            
            //len = j-i+1;
            maxLength= Math.max(j-i+1 , maxLength);
            j++;
        }
        // here rather than deleting that element i'm adding that zero also and eventually before returning just subtract 1 
        // same action as you hide that zero or add as one and remove from answer
        return maxLength-1;
    }
}
