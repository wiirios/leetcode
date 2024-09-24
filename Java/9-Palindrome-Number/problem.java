class Solution {
    public boolean isPalindrome(int x) {
        String y = String.valueOf(x);

        StringBuilder output = new StringBuilder();

        output.append(y);

        if(y.contains(output.reverse())) {
            return true;
        }
        return false;
    }
}