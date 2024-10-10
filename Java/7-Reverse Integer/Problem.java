class Solution {
    public int reverse(int x) {
        int remainder = 0;
        int result = 0;        
        int sign = (x < 0) ? -1 : 1;
        
        x = Math.abs(x);
        
        while (x > 0) {
            remainder = x % 10;         
            x = x / 10;                 
            if (result > (Integer.MAX_VALUE - remainder) / 10) {
                return 0;
            }
            result = result * 10 + remainder;
        }
        return result * sign;
    }
}
