// there are two solution for this 
// one with HashMap and another one with two pointer 

class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        
        int ans=0;
        
//         HashMap<Integer , Integer> map = new HashMap<>();
        
       
//         for(int i=0;i<n;i++)
//         {
//             // understood 
//             // yaha ye map.get(k-nums[i])>0  hona bahut zaruri h otherwise ye 
//             // map.contains ko true return karega bcz chahe value '0' hi ho but h to sahi na 
//             // and we can't even remove too bcz remove karne pe agar more than 1 value h vo bhi remove ho jayenege 
//             if(map.containsKey(k-nums[i]) && map.get(k-nums[i])>0)
//             {
//                 ans++;
//                 map.put(k-nums[i] , map.get(k-nums[i])-1);
                
//             }
//             else
//             {
//                 map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
//             }
//         }
        
        
        
        int left =0 , right = n-1;
        Arrays.sort(nums);
        
        while(left<right)
        {
            if(nums[left]+nums[right]<k)
            {
                left++;
            }
            else if(nums[left]+nums[right]>k)
            {
                right--;
            }
            else
            {
                left++;
                right--;
                ans++;
            }
        }
        
        return ans;
    }
}
