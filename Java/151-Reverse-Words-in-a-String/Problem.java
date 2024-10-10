// this is the worst code i have wrote in my entire life

//after made this shit i went to see other solutions and i ended up discovering a method called split if i had known about it before this code would have been less ugly

class Solution {
    public String reverseWords(String s) {
        int sl = s.length();
        
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringResult = new StringBuilder();

        for (int i = sl - 1; i >= 0; i--) {
            try {
                if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                    stringResult.append(s.charAt(i));
                }
                if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                    stringResult.reverse();
                    stringBuilder.append(stringResult);
                    stringBuilder.append(" ");
                    stringResult.setLength(0);
                }
                if (i == 0) {
                    stringResult.reverse();
                    stringBuilder.append(stringResult);
                }
                } catch (StringIndexOutOfBoundsException e) {
                    stringResult.reverse();
                    stringBuilder.append(stringResult);
            }
        }
        if (stringBuilder.charAt(0) == ' ') {
            stringBuilder.deleteCharAt(0);
            }

        return stringBuilder.toString();
    }
}
