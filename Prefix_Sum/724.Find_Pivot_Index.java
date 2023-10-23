// don't use array here to store prefix or suffix sum 
// just keep variables to store 
// question want's us to not even store the suffix value 
// no it was our mistake we didn't put i++ in loop that's why it was telling time limit exceeded
// only sum of array and prefixSum value 
class Solution {
    public int pivotIndex(int[] nums) {
        // basic approach 
        
        int n= nums.length;
        //int[] prefixSum = new int[n];
        //int[] suffixSum = new int[n];
        //int i=1,j=n-2;
        int suffix=0;
        int prefixSum =0;
        for(int i=0;i<n;i++)
        {
            suffix+=nums[i];
        }
        //System.out.println(total);
        int i=0;
        //int rightSum=0;
        //if(suffix==prefixSum) return 0;
        while(i<n)
        {
            
            //suffixSum[i]= suffixSum[i+1]+nums[i+1];
            suffix = suffix-nums[i];
            if(suffix==prefixSum)
            {
                return i;
            }
            prefixSum= prefixSum+nums[i];
            i++;
        }
        //i=0;
        // while(i<n)
        // {
        //     if(suffixSum[i]==prefixSum[i])
        //     {
        //         return i;
        //     }
        // }
        
        return -1;
    }
}
