// always consider edge cases while making these own solutions Please 


// Learn about bit manipulation ... how to think about this approach 
// i'll commit it later not in mood to write so much 
class Solution {
    public int singleNumber(int[] nums) {
        // only one element is alone rest are in doubles 
        // okk coooll
        // how can i approach this using array 
        // one we can sort the array and then find the element 
//         Arrays.sort(nums);
//         int n = nums.length;
//         if(n==1) return nums[0];
//         if(nums[0]!=nums[1]) return nums[0];
//         if(nums[n-1]!=nums[n-2]) return nums[n-1];
//         for(int i=1;i<nums.length-1;i++)
//         {
//             if(nums[i]!=nums[i-1]    && nums[i]!=nums[i+1])
//             {
//                 return nums[i];
//             }
//         }
        
        
//         return -1;
        
        
        // now another approach 
        // using hash map 
//         HashSet<Integer> set = new HashSet<Integer>();
//         int n = nums.length;
//         for(int i=0;i<n;i++)
//         {
//             if(set.contains(nums[i]))
//             {
//                 set.remove(nums[i]);
//             }
//             else
//             {
//                 set.add(nums[i]);
//             }
            
//         }
//         //int[] ans = set.toArray();
//         int ans=0;
//         //The Java Iterator is an interface added in the Java Programming
//         Iterator<Integer> h = set.iterator();
        
//         while(h.hasNext())
//         {
//             ans = h.next();
//         }
//         System.out.println(set);
//         return ans;
        
        
        // now the real solution comes 
        // without using extra space 
        // use of bit manipulation 
        
        
        int ans =0;
        int n = nums.length;
        // because we know n^0 is always n so...
        for(int i=0;i<n;i++)
        {
            ans ^= nums[i];
        }
        
        return ans;
    }
}
