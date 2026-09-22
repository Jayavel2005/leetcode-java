class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                swap(i, k++, nums);
            }
        }
        return k;
    }
    public void swap(int k, int i, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k] = temp;
    }
}