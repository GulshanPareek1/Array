// max no of vowels in a substring 
// sliding window means not need to check for every substring's each value for every window 
// sliding window means just checking for the element which is being added and which is being left/removed of previous window 

// or we can also use set here for storing the vowels and can check through set.contains(s.charAt(i)) method and directly can increase decrease ans ....
// but that will increase mempory consumption 

class Solution {
    public int maxVowels(String s, int k) {
        int ans=0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                ans++;
            }
        }
        int maxx= ans;
        for(int i=k;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                ans++;
            }
            if(isVowel(s.charAt(i-k)))
            {
                ans--;
            }
            maxx= Math.max(ans , maxx);
        }
        
        return maxx;
    }

    private boolean isVowel(char c){
        if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) return true;
        return false;
    }
}


// max no of vowels in a substring 
// sliding window means not need to check for every substring's each value for every window 
// sliding window means just checking for the element which is being added and which is being left/removed of previous window 
// class Solution {
//     public int maxVowels(String s, int k) {
//         int i=0,j=k-1;
//         int ans=vowelsInString(s,i,j);
//         int maxx = ans;
//         i++;j++;
//         while(j<s.length())
//         {
//                if(s.charAt(j)=='a' ||s.charAt(j)=='e' ||s.charAt(j)=='i' ||s.charAt(j)=='o' ||s.charAt(j)=='u' ){
//                    ans++;
//                }
//             if(s.charAt(i-1)=='a' ||s.charAt(i-1)=='e' ||s.charAt(i-1)=='i' ||s.charAt(i-1)=='o' ||s.charAt(i-1)=='u' ){
//                    ans--;
//                }
//             i++;j++;
//             maxx = Math.max(maxx , ans);
//         }
//         return maxx;
//     }
    
//     int vowelsInString(String s , int start , int end)
//     {
//         int vowel=0;
//         while(start<=end)
//         {
//             if(s.charAt(start)=='a' ||s.charAt(start)=='e' ||s.charAt(start)=='i' ||s.charAt(start)=='o' ||s.charAt(start)=='u' )
//             {
//                 vowel++;
//             }
            
//             start++;
//         }
        
//         return vowel;
//     }
// }
