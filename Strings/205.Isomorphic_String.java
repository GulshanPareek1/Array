// nice and easy solution using map but we can potimze it more yet

class Solution {
    public boolean isIsomorphic(String s, String t) {

//         HashMap<Character,Character> map = new HashMap();
        
//         for(int i=0;i<s.length();i++)
//         {
//             if(map.containsKey(s.charAt(i)))
//             {
//                 if(!map.get(s.charAt(i)).equals(t.charAt(i)))
//                 {
//                     return false;
//                 }
                
//             }
//             else
//             {
//                 if(map.containsValue(t.charAt(i))) return false;   
//                 map.put(s.charAt(i),t.charAt(i));
//             }
//         }
//         return true;
        
        
        // rather than two we can also use only one map of 127*2
        int[] map = new int[127];
        int[] map2 = new int[127];
        //int[] map = new int[254];
        
        
        if(s.length()!=t.length())
        {
            return false;
        }
        
        for(int i=0;i<s.length();i++)
        {
            
            if(map[s.charAt(i)]!=map2[t.charAt(i)])
            {
                return false;
            }
            
            map[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
     
        return true;
    }
}

//instead of new int[200] you can replace it with 127 it is the max capacity

//ArrayList<Integer> list1 = new ArrayList(map.values());
//List<Integer> keys = new ArrayList(map.keySet());
//List<Integer> values = new ArrayList<>(map.values());
