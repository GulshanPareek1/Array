class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        ans[0]=1;
         for(int i=1;i<n;i++)
         {
             ans[i] =nums[i-1]*ans[i-1]; 
         }
        System.out.println(Arrays.toString(ans));
        int last = 1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]= ans[i]*last;
            last = last*nums[i];
        }
        System.out.println(Arrays.toString(ans));
        
        return ans;
    }
}



// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         // start solving 
//         // we can't use the division operation so keep in mind that also 
//         int n = nums.length;
//         int[] ans = new int[n];
//         int[] ans2 = new int[n];
//         // first go and find prefix for all the array element 
//         // now go find suffix for all the array element 
//         ans[0]=1;
//         for(int i=1;i<n;i++)
//         {
//             ans[i] =nums[i-1]*ans[i-1]; 
//         }
//         //System.out.println(Arrays.toString(ans));
//         // now go find suffix and store in this ans array only 
//         ans2[n-1]=1;
//         for(int i=n-2;i>=0;i--)
//         {
//             ans2[i] = nums[i+1]*ans2[i+1];    
//         }
//         //System.out.println(Arrays.toString(ans2));
//         for(int i=0;i<n;i++)
//         {
//             ans[i] = ans[i]*ans2[i];
//         }
//         return ans;
//     }
// }
