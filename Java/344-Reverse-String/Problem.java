class Solution {
    public void reverseString(char[] s) {
        int sl = s.length;

        for (int i = 0, j = sl - 1; i < j; i++, j--) {
            char a = s[i]; 
            
            s[i] = s[j];
            s[j] = a;
        }

    }
}