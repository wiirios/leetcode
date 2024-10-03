class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1Size = word1.length();
        int w2Size = word2.length();

        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;

        while(i <= w1Size || i < w2Size) {
            if (i < w1Size) {
                stringBuilder.append(word1.charAt(i));
            }
            if (i < w2Size) {
                stringBuilder.append(word2.charAt(i));
            }
            i++;
        }
        return stringBuilder.toString();
    }
}