// one is using two pointers approach 
// keep swapping first and last element 
// we can also use stack here store in stack and then put in array again 
class Solution {
    public void reverseString(char[] s) {
        
        int first=0;
        int last = s.length-1;
        while(first<last)
        {
            char temp = s[first];
            s[first]=s[last];
            s[last]=temp;
            first++;
            last--;
            
            
            // great learning like this we're only changing the reference value not the exact value of array 
            // so change the array value itself 
            // char temp=first;
            // first=last;
            // last=temp;
            // first++;
            // last--;
        }
        
        
        
    }
}
