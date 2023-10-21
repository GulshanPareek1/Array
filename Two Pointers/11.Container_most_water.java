class Solution {
    public int maxArea(int[] height) {
        int max_Area = 0;
        
        //int n = height.length;
        int left =0,right=height.length-1;
        
        
        while(left<right)
        {
            if(height[left]<height[right])
            {
                max_Area = Math.max(max_Area , (right-left)*height[left]);
                left++;
            }
            else
            {
                max_Area = Math.max(max_Area , (right-left)*height[right]);
                right--;
            }
        }
        
    return max_Area;
    }
}
