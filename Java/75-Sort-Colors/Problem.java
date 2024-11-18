class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums); Beats 100.00% (obvious~)
        // You must solve this problem without using the library's sort function.

        // After studying data structure I'm finally able to solve these sort problems ;d
        // the next step is using the DNF algorithm!
        for (int i = 0; i < nums.length; i++) {
			int a = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[a]) {
					a = j;
				}
			}
			int b = nums[a];
			nums[a] = nums[i];
			nums[i] = b; 
		}
    }
}
