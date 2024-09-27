class Solution {
    public int lengthOfLastWord(String s) {
        int sl = s.length();
        int count = 0;
        
        for (int i = sl - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count += 1;
            } else if (count >= 1 && s.charAt(i) == ' ') {
                break;
            }
        }
        return count;
    }
}