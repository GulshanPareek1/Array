// // easy but large solution 
// there are two solution one with only using hashmap 
// time - O(N) space O(N)

// ano another one with using sort 
// time O(NlogN) and space same 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
            
        HashMap<HashMap<Character,Integer>,ArrayList<String>> map = new HashMap();
        
        for(String str:strs)
        {
            HashMap<Character,Integer> mp = new HashMap();
            for(int i=0;i<str.length();i++)
            {
                mp.put(str.charAt(i) , mp.getOrDefault(str.charAt(i),0)+1);
            }
            
            if(!map.containsKey(mp))
            {
                ArrayList<String> list = new ArrayList();
                list.add(str);
                map.put(mp,list);
            }
            else
            {
                ArrayList<String> list = map.get(mp);   // map.getValue   this is different method go google 
                list.add(str);
                //map.put(mp,list);
            }
        }
        // now we have all the Lists inside map so put them all in a seprate list 
        
        List<List<String>> listt = new ArrayList();
        for(ArrayList<String> val:map.values())
        {
            listt.add(val);
        }
        
        //return new ArrayList<>(map.values());
        return listt;
    
}
}

// this is using sorting 
// dry run and check 
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();
        
//         for (String word : strs) {
//             char[] chars = word.toCharArray();
//             Arrays.sort(chars);
//             String sortedWord = new String(chars);
            
//             if (!map.containsKey(sortedWord)) {
//                 map.put(sortedWord, new ArrayList<>());
//             }
            
//             map.get(sortedWord).add(word);
//         }
        
//         return new ArrayList<>(map.values());
//     }
// }
