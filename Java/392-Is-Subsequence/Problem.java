class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl = s.length();
        int k = 0;

        try {
         for (int i = 0; i < t.length(); i++) {
                if (s.charAt(k) == t.charAt(i)) {
                    k++;
                }
            }   
        } catch (StringIndexOutOfBoundsException e) {
            return true;
        }

        if (k == sl) {
            return true;
        } else {
            return false;
        }
        // Beats 64.38%
        // OR

        for (int i = 0; i < t.length(); i++) {
            if (k == sl) {
                return true;
            }
            if (s.charAt(k) == t.charAt(i)) {
                k++;
            }
        }
        return k == sl;
        // Beats 93.17%
    }
}