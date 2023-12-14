class Solution {
    public int searchInsert(int[] nums, int target) {
        // i got it how to solve it 
        // just see that array is sorted so we can apply binary search and then try dry run then you will find the soution 
        int start = 0;
        int end = nums.length-1;
        int mid=0;
        while(start <= end)
        {
            mid = start + (end-start)/2;
            if(nums[mid]<target)
            {
                start = mid+1;
            }
            else if(nums[mid]>target)
            {
                end = mid-1;
            }
            else
                return mid;
        }
        return start;
    }
}
