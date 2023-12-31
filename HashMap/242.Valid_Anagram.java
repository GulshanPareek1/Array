// first simple method is this 
// use two arrays and put all the char and then compare all the array elements 
// now optimise this 
// rather then two arrays we can use only one and work with that 
// time complexity O(N)  space - O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] arr1 = new int[26];
        //int[] arr2 = new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            arr1[s.charAt(i)-'a']++;
            //arr2[t.charAt(i)-'a']+=1;
            arr1[t.charAt(i)-'a']--;
        }
        // for(int i=0;i<26;i++)
        // {
        //     if(arr1[i]!=arr2[i]) return false;
        // }
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=0) return false;
        }
        //if(arr1==arr2) return true;
        
        return true;
    }
}

// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
// we're given a follow up for the question so approach for that 
// here we can't use character array 
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
}
