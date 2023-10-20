class Solution {
    public void moveZeroes(int[] nums) {
        
        // first hit and try 
        // then dry run the approach 
        int n=nums.length;
        if(n==0 || n==1) return;
        // one more great solution 
        // first put all the non zero value in start of array and then in rest put zeros 
        // simple 
        
        int j=0;
        for(int i=0;i<n;i++)
        {
            // put all the non zeros in the begining of array
            if(nums[i]!=0)
            {
                nums[j++]=nums[i];
            }
        }
        for(;j<n;j++)
        {
            nums[j]=0;
        }
        
//         int left = 0;
//         int right = 0;
        
//         while(right<nums.length)
//         {
//             if(nums[right]==0) right++;
//             else if(nums[right]!=0) 
//             {
//                 //swap(nums[left] , nums[right]);
//                 int temp = nums[left] ;
//                 nums[left] = nums[right];
//                 nums[right] = temp;
//                 left++;
//                 right++;
//             }
//         }
    }
    
}
