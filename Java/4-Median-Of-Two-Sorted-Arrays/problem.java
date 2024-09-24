class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] combineNums = new int[m + n];

        System.arraycopy(nums1, 0, combineNums, 0, m);
        System.arraycopy(nums2, 0, combineNums, m, n);

        Arrays.sort(combineNums);

        if (combineNums.length %2 != 0) {
            int result = combineNums.length / 2;
            return combineNums[result];
        }
        else if (combineNums.length %2 == 0) {
            int r1 = combineNums.length / 2; // 2
            int r2 = combineNums.length / 2 - 1; // 1
            return (combineNums[r1] + combineNums[r2]) / 2.0;
        }
        return 0;
    }
}