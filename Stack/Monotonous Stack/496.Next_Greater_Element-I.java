// store next greater element in right for nums2 array 
// easiest way first find for second array and store in map and then find for first array and then return 
// now try to optimise
// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         // 
//         int[] ans = nextGreaterElementRight(nums2);
//         HashMap<Integer , Integer> map = new HashMap();
//         for(int i=0;i<nums2.length;i++)
//         {
//             map.put(nums2[i],ans[i]);
//         }
//         int[] answer = new int[nums1.length];
//         for(int i=0;i<nums1.length;i++)
//         {
//             answer[i] = map.get(nums1[i]);
//         }
        
//         return answer;
//     }
    
//     public int[] nextGreaterElementRight(int[] nums)
//     {
//         Stack<Integer> st = new Stack();
//         int[] ans = new int[nums.length];
//         for(int i=nums.length-1;i>=0;i--)
//         {
//             while(!st.isEmpty() && st.peek()<nums[i])
//             {
//                 st.pop();
//             }
            
//             if(!st.isEmpty() && st.peek()>nums[i])
//             {
//                 ans[i] = st.peek();
//             }
//             else
//             {
//                 ans[i] = -1;
//             }
            
//             st.push(nums[i]);
//         }
//         return ans;
//     }
// }

// nice optimised solution here we'll combine all the steps 
class Solution {
     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         HashMap<Integer , Integer> map = new HashMap();
         Stack<Integer> st = new Stack();
         
         for(int i=0;i<nums2.length;i++)
         {
             // jin jin ka hoga next greater elementy unka nikal lenge baki ka -1 baad me rakh denge 
             while(!st.isEmpty() && st.peek()<nums2[i])
             {
                 map.put(st.pop(),nums2[i]);
             }
             
             st.push(nums2[i]);
         }
         
         for(int i=0;i<nums1.length;i++)
         {
             nums1[i]=map.getOrDefault(nums1[i] ,-1);
         }
         
         return nums1;
     }
}
