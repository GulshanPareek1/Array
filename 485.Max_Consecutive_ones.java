class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int left =0,right=0;
        int ans =0;
// this logic was basically for , if there are 0's in begining of array so we can directly start from the first 1
        // while(left<n)
        // {
        //     if(nums[left]==1)
        //     {
        //         right= left;
        //         break;
        //     }
        //     else
        //     {
        //         left++;
        //     }
        // }
        while(left<n && right<n)
        {
            if(nums[right]==1)
            {
                ans = Math.max(ans , right-left+1);
                right++;
            }
            else
            {
                left = right+1;
                right++;
            }
        }
        
        return ans;
    }
}
// public class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int result = 0;
//         int count = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 1) {
//         	count++;
//         	result = Math.max(count, result);
//             }
//             else count = 0;
//         }
        
//         return result;
//     }
// }
