import java.util.Map.Entry;
import java.util.HashMap;
// uses 61mb of memory lmfao
class Solution {
    public int findDuplicate(int[] nums) {
        int numsL = nums.length;    
        int r = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < numsL; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                r = entry.getKey();
            }
        }
        return r;
    }
}