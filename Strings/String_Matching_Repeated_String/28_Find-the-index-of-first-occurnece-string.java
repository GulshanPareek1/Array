// // just simple string operation related question 
// // keep going in the flow 
// both the solutions are best 
// class Solution {
//     public int strStr(String haystack, String needle) {
//         int i=0;
//         while(i<haystack.length())
//         {
//             if(haystack.charAt(i)==needle.charAt(0))
//             {
//                 if(i+needle.length()<=haystack.length()  && haystack.substring(i,i+needle.length()).equals(needle)) return i;
//             }
            
//             i++;
//         }
        
//         return -1;
//     }
// }



class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        int nIndex = 0;
        for(int i=0; i<hLen; i++){
            // as long as the characters are equal, increment needleIndex
            if(haystack.charAt(i)==needle.charAt(nIndex)){
                nIndex++;
            }
            else{
                // start from the next index of previous start index
                i=i-nIndex;
                // needle should start from index 0
                nIndex=0;
            }
            // check if needleIndex reached needle length
            if(nIndex==nLen){
                // return the first index
                return i-nLen+1;
            }
        }
        return -1;
    }
}
