class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums); Beats 100.00% (obvious~)
        // You must solve this problem without using the library's sort function.

        int numsL = nums.length;

        // working in this

        for (int i = 0, j = numsL - 1; i < j; i++) {
            if (nums[i] > nums[j]) {
                int a = nums[i]; 

                nums[i] = nums[j];
                nums[j] = a;
                j--;
            }
        }

    }
}