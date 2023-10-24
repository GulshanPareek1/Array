// simple basic learning of set 
// Learning - don't find for array find in set (line 27)
// and don't directly put int values in ans (list of list) make seperate lists for Integer
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList(2);
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        int m = nums1.length;
        int n= nums2.length;
        int l=0,j=0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        while(l<m || j<n)
        {
            if(l<m)
            {
                set1.add(nums1[l]);
            }
            if(j<n)
            {
                set2.add(nums2[l]);
            }
            l++;
            j++;
        }
        // now rather than finding in whole array we should find in set only 
        // because array may have duplicate values so that can give us duplicate values in ans 
        // for(int i=0;i<m;i++)
        // {
        //     if(!set2.contains(nums1[i]))
        //     {
        //         ans1.add(nums1[i]);
        //     }
        // }
        // for(int i=0;i<n;i++)
        // {
        //     if(!set1.contains(nums2[i]))
        //     {
        //         ans2.add(nums2[i]);
        //     }
        // }
        for(int a: set1)   // traverse the set 
        {
            if(!set2.contains(a))
            {
                ans1.add(a);
            }
        }
        
        for(int a:set2)
        {
            if(!set1.contains(a))
            {
                ans2.add(a);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        
        return ans;
    }
}
