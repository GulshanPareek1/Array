// basically three methods 
// one simple without doing any extra effort and extra space just keep doing as our thinking while we solve the question 
// store the values in map and put one check  if(nums[i]<nums[i+1]) and keep adding 

// last - store the respective values in array and just simple check 

// class Solution {
//     public int romanToInt(String s) {
        
//         int ans=0;
        
        
//         for(int i=0;i<s.length();i++)
//         {
//             char ch = s.charAt(i);
//             if(s.charAt(i)=='I')
//             {
//                 if(i+1<s.length() && s.charAt(i+1)=='V' )
//                    {
//                        ans-= 1;
//                    }
//                 else if(i+1<s.length() && s.charAt(i+1)=='X')
//                 {
//                     ans-=1;
//                 }
//                 else
//                 {
//                     ans+=1;
//                 }
//             }
//             else if(ch=='V')
//             {
//                 ans+=5;
//             }
//             else if(ch=='X')
//             {
//                 if(i+1<s.length() && s.charAt(i+1)=='L' )
//                    {
//                        ans-= 10;
//                    }
//                 else if(i+1<s.length() && s.charAt(i+1)=='C')
//                 {
//                     ans-=10;
//                 }
//                 else
//                 {
//                     ans+=10;
//                 }
//             }
//             else if(ch=='L')
//             {
//                 ans+=50;
//             }
//             else if(ch=='C')
//             {
//                 if(i+1<s.length() && s.charAt(i+1)=='D' )
//                    {
//                        ans-= 100;
//                    }
//                 else if(i+1<s.length() && s.charAt(i+1)=='M')
//                 {
//                     ans-=100;
//                 }
//                 else
//                 {
//                     ans+=100;
//                 }
//             }
//             else if(ch=='D')
//             {
//                 ans+=500;
//             }
//             else
//             {
//                 ans+=1000;
//             }
//         }
        
//         return ans;
//     }
// }


// can also use array for storing these 
// class Solution {
//     public int romanToInt(String s) {
//         Map<Character, Integer> m = new HashMap<>();
        
//         m.put('I', 1);
//         m.put('V', 5);
//         m.put('X', 10);
//         m.put('L', 50);
//         m.put('C', 100);
//         m.put('D', 500);
//         m.put('M', 1000);
        
//         int ans = 0;
        
//         for (int i = 0; i < s.length(); i++) {
//             if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
//                 ans -= m.get(s.charAt(i));
//             } else {
//                 ans += m.get(s.charAt(i));
//             }
//         }
        
//         return ans;
//     }
// }

class Solution {
 public int romanToInt(String s) {
    int nums[]=new int[s.length()];
    for(int i=0;i<s.length();i++){
        switch (s.charAt(i)){
            case 'M':
                nums[i]=1000;
                break;
            case 'D':
                nums[i]=500;
                break;
            case 'C':
                nums[i]=100;
                break;
            case 'L':
                nums[i]=50;
                break;
            case 'X' :
                nums[i]=10;
                break;
            case 'V':
                nums[i]=5;
                break;
            case 'I':
                nums[i]=1;
                break;
        }
    }
    int sum=0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]<nums[i+1])
            sum-=nums[i];
        else
            sum+=nums[i];
    }
    return sum+nums[nums.length-1];
}
}

// this last one using array is most optimal according to question it's giving 100% 
