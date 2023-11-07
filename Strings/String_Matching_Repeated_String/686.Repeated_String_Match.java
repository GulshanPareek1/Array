class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        StringBuilder sb = new StringBuilder();
        int count=1;
        sb.append(a);
        while(sb.length()<b.length())
        {
            sb.append(a);
            count++;
        }
        // how to check if this string contains the another string inside this
        if(sb.toString().contains(b)) return count;
        //if(sb.equals(a)) return count;
        
        sb.append(a);
        if(sb.toString().contains(b)) return ++count;
        
        return -1;
    }
}

// there is one more solution named as Rabin-Carp algorithm 
// will describe and learn next time 
