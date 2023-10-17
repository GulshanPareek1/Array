// the approach for solving this kind of question should be like first draw the question statement and try for different test cases 
// or for any kind of questoins use this approach 
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int len = flowerbed.length;
        for(int i=0;i<len ;i++)
        {
            if(flowerbed[i]==0)
            {
                int prev = (i==0 || flowerbed[i-1]==0)?0:1;
                int next = (i==len-1 || flowerbed[i+1]==0)?0:1;
                if(prev==0 && next ==0) 
                {
                    flowerbed[i]=1;
                    n--;
                }
            }
            
            if(n<=0) return true;
            
        //     for (int i = 0; i < flowerbed.length; i++) {
        //     if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
        //         flowerbed[i] = 1;
        //         n--;
        //         if (n == 0) {
        //             return true;
        //         }
        //     }
        // }
        }
        
        //return n<=0;
        return false;
}
}


//
//         int len = flowerbed.length;
//         for(int i=0;i<len ;i++)
//         {
//             if(i==0 && i>0 && flowerbed[i]==0 &&  flowerbed[i+1]==0)
//             {
//                 flowerbed[i]=1;
//                 n--;
//             }
            
//             if(i==n-1 && flowerbed[i]==0 && i>1 && flowerbed[i-1]==0)
//             {
//                 flowerbed[i]=1;
//                 n--;
//             }
            
//             if(flowerbed[i]==0 && i>0 && i<len-1 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
//             {
//                 flowerbed[i]=1;
//                 n--;
//             }
            
        
        
//     }
//         if(n==0) return true;
        
        
//         return false;
