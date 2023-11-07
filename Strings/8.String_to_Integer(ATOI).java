

class Solution {
    public int myAtoi(String str) {
        
        final int len = str.length();
        
        if(len == 0){
            return 0;
        }
        
        int index = 0;
        while(index < len && str.charAt(index) == ' '){
            index++;
        }
        
        if(index == len){
            return 0;
        }
        
        char ch;
        boolean isNegative = (ch = str.charAt(index)) ==  '-';
        
        if(isNegative || ch == '+'){
            ++index;
        }
            
        final int maxLimit = Integer.MAX_VALUE / 10;
        int result = 0;
        while(index < len && isDigit(ch = str.charAt(index))){
            
            int digit = ch - '0';
            
            if(result > maxLimit || (result == maxLimit && digit > 7)){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            result = (result * 10) + digit;
            
            ++index;
        }
        
        return isNegative ? -result : result;
    }
    
    private boolean isDigit(char ch){
        return ch >= '0' && ch <= '9';
    }
}












// Let's understand what
// if(result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
//          return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
// }
// means in JAVA? You will be able to figure out this statement easily for C++ code too.

// result > (Integer.MAX_VALUE / 10) means:
// Suppose,
// result = 214748365(9 digits)
// Integer.MAX_VALUE = 2147483647(10 digits) and Integer.MAX_VALUE / 10 = 214748364(9 digits)
// Here, it is clearly evident that result > Integer.MAX_VALUE / 10( i.e. 214748365 > 214748364) and if we try to add even 0(zero) in result 214748365(9 digits), the number will become 2147483650(10 digits) which is obviously greater than 2147483647(Integer.MAX_VALUE which is of 10 digits). So even before adding 0(zero) or any other digit, we return the Integer.MAX_VALUE or Integer.MIN_VALUE, according to the sign case, in order to avoid integer overflow.

// And, result == (Integer.MAX_VALUE / 10) && digit > 7 means:
// Suppose,
// result = 214748364(9 digits), and
// Integer.MAX_VALUE / 10 = 214748364(9 digits)
// Now, if the result is equal to the Integer.MAX_VALUE / 10 (214748364 == 214748364) and the digit is greater than 7 i.e. digit > 7 and if we try to add 8(assume the digit greater than 7 to be 8) to the result, then the number will become 2147483648(10 digits), which will result in integer overflow. So, even before adding the digit which is greater than 7, we return the Integer.MAX_VALUE or Integer.MIN_VALUE, according to the sign case, to avoid integer overflow.
