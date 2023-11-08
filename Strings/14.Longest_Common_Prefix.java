// first sort the array and then check for prefix in first and last element 
// once after solving try to optimise in terms of time and space 
// one more way to reduce space use don't use stringBuilder use substring 
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        
        // compare the first and last element of array 
        String first = strs[0];
        String second = strs[strs.length-1];
        if(first.equals(second)) return first;
        //StringBuilder ans= new StringBuilder();
//         for(int i=0;i<first.length()  ;i++)    //&& i<second.length() but no need of this 
//         {
//             if(first.charAt(i)!=second.charAt(i))
//             {
//                 return ans.toString();
                
//             }
//             else
//             {
//                 ans.append(first.charAt(i));
//             }
            
//         }
        
//         return ans.toString();
        
        int i=0;
        while(i<first.length() && i<second.length())
        {
            if(first.charAt(i)==second.charAt(i))
            {
                i++;
            }
            else
            {
                break;
            }
        }
        
        return first.substring(0,i);
    }
}

// this has little less space consumption 
