class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int max = 0;
        int result;
        
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
            }

        for (int j = 0; j < candies.length; j++) {
            result = extraCandies + candies[j];
            if (result >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}