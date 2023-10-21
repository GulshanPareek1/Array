// here logic is simple 
// only thing to take care is calculation error should be less then ...
// edge cases 
// here we have to absolutely use the sliding window method
// and we use this so that we don't need to calculate sum for whole subarray every time 
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // it seems easy sliding window problem 
        
        long sum =0 ;
       
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        long maxSum = sum;
        
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[i-k] ;
            
            if(maxSum<sum) maxSum = sum;
        }
        return (double)maxSum/k;
    }
    
    
}
