class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // one solution is using two loops but that will cost us O(n2)
        // i've comeup with this question before as well
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                ans[0] =map.get(target-nums[i]);
                    
                ans[1] = i;
                return ans;
            }
            else
               map.put(nums[i] , i);
        }
               
        return ans;
        
    }
}

// here we store in HashMap in this way map.put(nums[i] , i);
// here nums[i] is key and i is value so key value pair 
//don't make this mistake 
