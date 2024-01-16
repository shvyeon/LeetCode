class Solution {
    public boolean isPalindrome(int x) {
        boolean result = false;
        int n = x;
        int rev = 0;
        
        while(n > 0){
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        
        result = x==rev ? true: false;
        
        return result;
    }
}