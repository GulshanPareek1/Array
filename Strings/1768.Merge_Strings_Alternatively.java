class Solution {
    public String mergeAlternately(String word1, String word2) {
            int m = word1.length();
            int n = word2.length();
                
        // we are making array bcz traversing in array is easy and we can make for exact space 
        // and we know eventually we can change array to string 
            char[] ans = new char[m+n];
        int i=0 , j=0 , k =0;
        while(i<m || j<n)
        {
            if(i<m)
            {
                ans[k++] = word1.charAt(i);
                i++;
            }
            
            if(j<n)
            {
                ans[k++] = word2.charAt(j);
                j++;
            }
        }
        
        return new String(ans);
    }
}

// or this is different solution using string as answer only 
/// we know string concatenation property 

// //class Solution {
//     public String mergeAlternately(String word1, String word2) {
//           String output = "";
//         int i = 0;

//         while (i < word1.length() || i < word2.length()) {
            
//             if ( i < word1.length() ) {
//                 output += word1.charAt(i);
//             }

//             if (i < word2.length()) {
//                 output += word2.charAt(i);
//             }

//             i++;

//         }

//         return output;
//     }
// }
