// this is the perfect understood solution 
// and the solutin using map was also helpful in understanind map concept thoroughly
class Solution {
    private int N =26;
    public boolean closeStrings(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(char ch:word1.toCharArray())
        {
            arr1[ch-'a']++;
        }
        for(char ch:word2.toCharArray())
        {
            arr2[ch-'a']++;
        }
        
        
        // now check if value is present in both the arrays not missing from any one array 
        
        for(int i=0;i<N;i++)
        {
            if(arr1[i]==arr2[i])   // understand the concept here 
            {// it also includes the case 0==0  if  any alphabet is missing in both then continue
                continue;
            }
            // for watching if value is in both the arrays not in any single
            if(arr1[i]==0 || arr2[i]==0)
            {
                return false;
                // case for 0==0 (not present in both arrays is already covered)
            }
        }
        // now check if the overall occourance order is same in both arrays 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i=0;i<N;i++)
        {
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}
// these all print statements are for debug purpose only so don't get distrubed by these 

// class Solution {
//     public boolean closeStrings(String word1, String word2) {
//         int m = word1.length();
//         int n = word2.length();
//         if(m!=n) return false;
        
//         char[] arr1 = word1.toCharArray();
//         char[] arr2 = word2.toCharArray();
        
// //         Arrays.sort(arr1);
// //         Arrays.sort(arr2);
        
// //         if(Arrays.equals(arr1,arr2)) return true;
        
        
//         // till here first operation is considered 
//         // now go for second operation how to manage that 
        
//         // what i can see by operation is that after this 
//         // occourance of elements are same means if any char is 3 times in first string than in 2nd any other char will be but values array for the keys should be same
        
//         HashMap<Character , Integer> map1 = new HashMap<>();
//         HashMap<Character , Integer> map2 = new HashMap<>();
        
//         for(int i=0;i<m;i++)
//         {
//             map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
//             map2.put(arr2[i],map2.getOrDefault(arr2[i],0)+1);
//         }
//         // System.out.println(map1);
//         // System.out.println(map2);
//         // Set<Integer> set1 = new HashSet<>();
//         // Set<Integer> set2 = new HashSet<>();
//         // System.out.println("nums1 check " + map1.keySet());
//         // System.out.println("nums1 check " + map2.keySet());
//         if(!map1.keySet().equals(map2.keySet())) return false;
//         // System.out.println("nums1 check ");
//          ArrayList<Integer> nums1 = new ArrayList<>(map1.values());
//          ArrayList<Integer> nums2 = new ArrayList<>(map2.values());
        
//         // traverse map 
//         // for(Map.Entry<Character,Integer> entry:map1.entrySet())
//         // {
//         //     //set1.add(entry.getValue());
//         //     nums1.add(entry.getValue());
//         // }
//         // for(Map.Entry<Character,Integer> entry:map2.entrySet())
//         // {
//         //     //set2.add(entry.getValue());
//         //     nums2.add(entry.getValue());
//         // }
//         // rather than doing this we can direct initialise the Arraylist
//         Collections.sort(nums1);
//         Collections.sort(nums2);
//         //if(Collections.equals(nums1, nums2))) return true;
//         // System.out.println(nums1);
//         // System.out.println(nums2);
//         //if(!nums1.equals(nums2)) return false;
        
//         return nums1.equals(nums2);
//     }
// }














// // class Solution {
// //     public boolean closeStrings(String word1, String word2) {
// // 	if (word1.length() != word2.length()) {
// // 		return false;
// // 	}
// // 	Map<Character, Integer> word1Map = new HashMap<>();
// // 	Map<Character, Integer> word2Map = new HashMap<>();
// // 	for (char c : word1.toCharArray()) {
// // 		word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
// // 	}
// // 	for (char c : word2.toCharArray()) {
// // 		word2Map.put(c, word2Map.getOrDefault(c, 0) + 1);
// // 	}
// // 	if (!word1Map.keySet().equals(word2Map.keySet())) {
// // 		return false;
// // 	}
// // 	List<Integer> word1FrequencyList = new ArrayList<>(word1Map.values());
// // 	List<Integer> word2FrequencyList = new ArrayList<>(word2Map.values());
// // 	Collections.sort(word1FrequencyList);
// // 	Collections.sort(word2FrequencyList);
// // 	return word1FrequencyList.equals(word2FrequencyList);
// // }
// // }
