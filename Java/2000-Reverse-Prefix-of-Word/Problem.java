class Solution {
    public String reversePrefix(String word, char ch) {
        int sl = word.length();
        int count = 0;

        StringBuilder sB = new StringBuilder();

        for (int i = 0; i < sl; i++) {
            sB.append(word.charAt(i));

            if (word.charAt(i) == ch && count == 0) {
                sB.reverse();
                count ++;
            }
        }
        return sB.toString();
    }
}