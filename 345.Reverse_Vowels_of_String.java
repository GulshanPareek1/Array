//new method of string 
    //String.valueOf(ans);  here ans is char array \
// understand difference between two methods String.valueOf()  and Arrays.toString()


class Solution {
    public String reverseVowels(String s) {
        int[] numbers = {1, 2, 3, 4, 5};
        char[] ch = {'a' , 'e' , 'i' , 'o' ,'u'};
        char[] ans = s.toCharArray();
        int n = s.length();
        int st = 0 , e = n-1;
        System.out.println(String.valueOf(ch));
        System.out.println(Arrays.toString(ch));
        System.out.println(String.valueOf(numbers));
        System.out.println(Arrays.toString(numbers));
        // here i've combined these output statements for better learnings of these two methods 
        
        while(st<e)
        {
            if(!isVowel(ans[st]))
            {
                st++;
            }
            else if(!isVowel(ans[e]))
            {
                e--;
            }
            
            if(isVowel(ans[st])  && isVowel(ans[e]))
            {
                char temp = ans[st] ;
                ans[st] = ans[e];
                ans[e] = temp;
                
                st++;
                e--;
            }
        }
        
        return String.valueOf(ans);
    }
    
    public boolean isVowel(char ch)
    {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' ||                             ch=='I' || ch=='O' || ch=='U' )
        {
            return true;
        }
        
        return false;
    }
}
