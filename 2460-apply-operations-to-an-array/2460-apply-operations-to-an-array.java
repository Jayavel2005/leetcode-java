class Solution {
    public int[] applyOperations(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                nums[i-1] = nums[i-1] * 2;
                nums[i] = 0;
            }
        }

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 ) {
                swap(i, k++, nums);
            }
        }
        return nums;
    }
    public void swap(int i, int k, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k] = temp;
    }
}