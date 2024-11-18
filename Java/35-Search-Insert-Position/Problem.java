class Solution {
    public int searchInsert(int[] nums, int target) {
        int end = nums.length - 1;
        int start = 0;

        while (start <= end) {
            int middle = (int) ((start + end) / 2);

            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return start;
    }
}